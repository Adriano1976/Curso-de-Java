package application;

import model.dao.DaoFactory;
import model.dao.implement.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramSeller {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SellerDaoJDBC sellerDaoJDBC = DaoFactory.createSellerDao();

        System.out.println(); // Retrieving some data in a specific row in seller.
        System.out.println("========== TEST 1: seller findById ==========");
        Seller seller = sellerDaoJDBC.findById(3);
        System.out.println(seller);

        System.out.println();
        System.out.println("========== TEST 2: seller findByDepartment ==========");
        Department department = new Department(2, null);
        List<Seller> list = sellerDaoJDBC.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println(); // Rescuing all existing data in seller.
        System.out.println("========== TEST 3: seller findAll ==========");
        list = sellerDaoJDBC.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println(); // Entering new data in seller.
        System.out.println("========== TEST 4: seller insert ==========");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDaoJDBC.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println(); // Changing the data already existing in the seller.
        System.out.println("========== TEST 5: seller update ==========");
        seller = sellerDaoJDBC.findById(1);
        seller.setName("Martha Waine");
        sellerDaoJDBC.update(seller);
        System.out.println("Update completed");

        System.out.println(); // Deleting data in seller.
        System.out.println("========== TEST 6: seller delete ==========");
        System.out.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        sellerDaoJDBC.deleteById(id);
        System.out.println("Delete completed");

        scanner.close();
    }
}
