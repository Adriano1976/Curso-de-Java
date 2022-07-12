package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\ADRIANO\\Dropbox\\PC (2)\\Documents\\Dicas txt\\ListEmployee.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String employeeCsv = reader.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                employeeCsv = reader.readLine();
            }

            Collections.sort(list);
            for (Employee employee : list) {
                System.out.println(employee.getName() + ", " + employee.getSobreNome() + ", " + employee.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
