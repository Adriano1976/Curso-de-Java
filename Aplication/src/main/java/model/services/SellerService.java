package model.services;


import model.dao.DaoFactory;
import model.dao.implement.SellerDaoJDBC;
import model.entities.Seller;

import java.util.List;

public class SellerService {

    private final SellerDaoJDBC dao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Seller seller) {
        if (seller.getId() == null) {
            dao.insert(seller);
        }else{
            dao.update(seller);
        }
    }

    public void remove(Seller seller) {
        dao.deleteById(seller.getId());
    }
}

