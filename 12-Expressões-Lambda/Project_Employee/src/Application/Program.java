package Application;

import Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            // Reading the data (name, email and salary) of employees from a file in 'csv' format.
            String line = reader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = reader.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();

            // Shows in alphabetical order the email of Employees with salary greater than a given amount provided by the user.
            List<String> emails = list.stream()
                    .filter(employee -> employee.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted()
                    .toList();
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            emails.forEach(System.out::println);

            // Sum of employee salaries starting with the letter 'M'.
            double sum = list.stream()
                    .filter(employee -> employee.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);
            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
