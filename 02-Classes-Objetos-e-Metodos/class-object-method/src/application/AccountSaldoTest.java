package application;// Entrada e saída de numeros de ponto flutuante com objetos entities.AccountSaldo

import entities.AccountSaldo;

import java.util.Scanner;

public class AccountSaldoTest {
    public static void main(String[] args) {
        AccountSaldo account1 = new AccountSaldo("Adriano Santos", 500.00);
        AccountSaldo account2 = new AccountSaldo("Neide Ferreira", -7.55);

        // exibe saldo inicial de cada objeto(correntista e saldo)
        System.out.printf("Correntista1: %s - Saldo: R$ %.2f \n", account1.getName(), account1.getBalance());
        System.out.printf("Correntista2: %s - Saldo: R$ %.2f \n", account2.getName(), account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela do comando
        Scanner input = new Scanner(System.in);

        System.out.print("\nInsira o valor do depósito na conta1: "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário1
        System.out.printf("\nadicionando R$ %.2f na conta1\n\n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1

        // exibe os saldos de cada correntista e saldo atual
        System.out.printf("Correntista1: %s - Saldo: R$ %.2f \n", account1.getName(), account1.getBalance());
        System.out.printf("Correntista2: %s - Saldo: R$ %.2f \n", account2.getName(), account2.getBalance());

        System.out.print("\nInsira o valor do depósito na conta2: "); // prompt
        depositAmount = input.nextDouble(); // obtém a entrada do usuário2
        System.out.printf("\nadicionando R$ %.2f na conta2\n\n", depositAmount);
        account2.deposit(depositAmount); // adiciona ao saldo de account2

        // exibe os saldos
        System.out.printf("Correntista1: %s - Saldo: R$ %.2f \n", account1.getName(), account1.getBalance());
        System.out.printf("Correntista2: %s - Saldo: R$ %.2f \n", account2.getName(), account2.getBalance());

    } // fim de main
} // fim da classe application.AccountSaldoTest
