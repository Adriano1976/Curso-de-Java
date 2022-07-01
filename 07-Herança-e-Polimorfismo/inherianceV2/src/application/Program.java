package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account account = new Account(102541, "Maria da Paz", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(102542, "Alex da Silva", 0.0, 500.0);

        // UPCASTING
        // Casting da subclasse para superclasse
        // Uso comum: polimorfismo

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003251, "Bob de Carvalho", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004252, "Anna Karla", 0.0, 0.05);

        // DOWNCASTING
        // Casting da superclasse para subclasse
        // Palavra instanceof
        // • Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)

        BusinessAccount account4 = (BusinessAccount)account2;
        account4.loan(100.0);

        // BusinessAccount account5 = (BusinessAccount)account;

        if (account3 instanceof BusinessAccount){
            BusinessAccount account5 = (BusinessAccount)account3;
            account5.loan(200.0);
            System.out.println("loan with sucessy!");
        }

        if (account3 instanceof SavingsAccount){
            SavingsAccount account5 = (SavingsAccount)account3;
            account5.updateBalance();
            System.out.println("Update with sucessy!");
        }
    }
}
