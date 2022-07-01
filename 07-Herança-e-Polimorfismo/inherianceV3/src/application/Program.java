package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account account1 = new Account(1001, "Alex Saint", 1000.00);
        System.out.println();
        System.out.println("Balance: " + account1.getBalance());
        account1.withdraw(200);
        System.out.println("Balance: " + account1.getBalance());

        Account account2 = new SavingsAccount(1002, "Mary Saint", 1000.00, 0.15);
        System.out.println();
        System.out.println("Balance: " + account2.getBalance());
        account2.withdraw(200.0);
        System.out.println("Balance: " + account2.getBalance());

        Account account3 = new BusinessAccount(1003, "Bob Marly", 1000.00, 500.00);
        System.out.println();
        System.out.println("Balance: " + account3.getBalance());
        account3.withdraw(200.00);
        System.out.println("Balance: " + account3.getBalance());
    }
}
