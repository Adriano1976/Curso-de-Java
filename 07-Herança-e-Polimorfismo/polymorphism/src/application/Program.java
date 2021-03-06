package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of employees: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if (ch == 'y' || ch == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                // Polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos.
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)); // Product added to the child class.
            } else {
                // Polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos.
                list.add(new Employee(name, hours, valuePerHour)); // Product added to the mother class.
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        scanner.close();

    }
}
