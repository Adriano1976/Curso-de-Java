package application;

import entities.Account;
import exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Inicial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());

        } catch (BusinessException e) {
            System.out.println(e.getMessage());

        }

        scanner.close();
    }
}
