package application;

import model.dao.DaoFactory;
import model.dao.implement.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DepartmentDaoJDBC departmentDaoJDBC = DaoFactory.createDepartmentDao();

        System.out.println(); // Retrieving some data in a specific row in department.
        System.out.println("========== TEST 1: department findById ==========");
        Department department = departmentDaoJDBC.findById(1);
        System.out.println(department);

        System.out.println(); // Rescuing all existing data in department.
        System.out.println("========== TEST 2: department findAll ==========");
        List<Department> list = departmentDaoJDBC.findAll();
        for (Department obje : list) {
            System.out.println(obje);
        }

        System.out.println();  // Entering new data in departments.
        System.out.println("========== TEST 3: department insert ==========");
        Department newDepartment = new Department(null, "Music");
        departmentDaoJDBC.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println();  // Changing the data already existing in the department.
        System.out.println("========== TEST 4: department update ==========");
        Department updateDepartment = departmentDaoJDBC.findById(1);
        updateDepartment.setName("Food");
        System.out.println("Udpdate completed");

        System.out.println(); // Deleting data in department
        System.out.println("========== TEST 5: department delete ==========");
        System.out.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        departmentDaoJDBC.deleteById(id);
        System.out.println("Delete completed");

        scanner.close();
    }
}
