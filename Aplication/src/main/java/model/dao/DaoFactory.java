package model.dao;


import gui.db.DB;
import model.dao.implement.DepartmentDaoJDBC;
import model.dao.implement.SellerDaoJDBC;

public class DaoFactory {

    public static model.dao.implement.SellerDaoJDBC createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static model.dao.implement.DepartmentDaoJDBC createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
