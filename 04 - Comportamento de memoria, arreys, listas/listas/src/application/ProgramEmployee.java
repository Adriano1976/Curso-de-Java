/*
— Fazer um programa para ler um número inteiro N e depois os dados (‘id’, nome e salario) de
N funcionários. Não deve haver repetição de ‘id’.
— Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
— Para isso, o programa deve ler um ‘id’ e o valor X. Se o ‘id’ informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários.
— Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base numa operação de
aumento por porcentagem dada.
 */

package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        // Reading data.
        System.out.print("How many employees will be registered? ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = scanner.nextInt();
            }
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        // Updating salary of given employee.
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            employee.increaseSalary(percentage);
        }

        // Listing employees
        System.out.println();
        System.out.println("---------- List of Employees ----------");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        scanner.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
