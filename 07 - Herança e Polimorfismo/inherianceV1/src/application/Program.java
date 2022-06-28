/*
— Suponha um negócio de banco que possui uma conta comum e uma conta para
empresas, sendo que a conta para empresa possui todos os membros da conta
comum, mais um limite de empréstimo e uma operação de realizar empréstimo
 */

package application;

import entities.BusinessAccount;

public class Program {

    public static void main(String[] args) {

        BusinessAccount account = new BusinessAccount(8010, "Adriano Santos", 0.0, 500.0);

        System.out.println("Conta: " + account.getNumber());
        System.out.println("Holder: " + account.getHolder());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Limit: " + account.getLoanLimit());
    }
}
