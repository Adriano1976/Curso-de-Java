package Application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {

        Connection connection = null; // Gerencia a conexão entre o programa Java e o banco de dados.
        Statement statement = null; // Envia instruções de SQL ao banco de dados

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
            connection.commit();

            System.out.println("Rows1: " + rows1);
            System.out.println("Rows2: " + rows2);

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());

            } catch (SQLException e1) {
                throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
            }

        } finally {
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }
}
