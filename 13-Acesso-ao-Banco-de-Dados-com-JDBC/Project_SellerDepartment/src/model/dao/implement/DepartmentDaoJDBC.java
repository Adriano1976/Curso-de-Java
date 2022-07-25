package model.dao.implement;

import db.DB;
import db.DbException;
import model.dao.IDepartmentDao;
import model.entities.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoJDBC implements IDepartmentDao {

    private final Connection connect;

    public DepartmentDaoJDBC(Connection connect) {
        this.connect = connect;
    }

    // insert implementation
    @Override
    public void insert(Department department) {

        PreparedStatement statement = null;

        try {
            statement = connect.prepareStatement("INSERT INTO department (Name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, department.getName());
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    department.setId(id);
                }else {
                    throw new DbException("Unexpected error! No rows affected!");
                }
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());

        } finally {
            DB.closeStatement(statement);
        }
    }

    // update implementation
    @Override
    public void update(Department department) {

        PreparedStatement statement = null;

        try {
            statement = connect.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?");
            statement.setString(1, department.getName());
            statement.setInt(2, department.getId());
            statement.executeUpdate();

        }catch (SQLException e) {
            throw new DbException(e.getMessage());

        } finally {
            DB.closeStatement(statement);
        }
    }

    // delete implementation
    @Override
    public void deleteById(Integer id) {

        PreparedStatement statement = null;

        try {
            statement = connect.prepareStatement("DELETE FROM department WHERE Id = ?");
            statement.setInt(1, id);
            statement.executeUpdate();

        }catch (SQLException e) {
            throw new DbException(e.getMessage());

        } finally {
            DB.closeStatement(statement);
        }

    }

    // findById implementation
    @Override
    public Department findById(Integer id) {

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connect.prepareStatement("SELECT * FROM department WHERE Id = ?");
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("Id"));
                department.setName(resultSet.getString("Name"));
                return department;
            }
            return null;

        }catch (SQLException e) {
            throw new DbException(e.getMessage());

        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }
    }

    // // findAll implementation
    @Override
    public List<Department> findAll() {

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connect.prepareStatement("SELECT * FROM department ORDER BY Name");
            resultSet = statement.executeQuery();

            List<Department> list = new ArrayList<>();

            while (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("Id"));
                department.setName(resultSet.getString("Name"));
                list.add(department);
            }

            return list;

        }catch (SQLException e) {
            throw new DbException(e.getMessage());

        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }
    }
}
