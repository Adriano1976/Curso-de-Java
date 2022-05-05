// Cria e manipula um objeto Account.

import java.util.Scanner;

public class AccountsText1 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // Cria um objeto Account e o atribui a myAccount.
        Accounts myAccount = new Accounts();

        // Exibe o valor inicial do nome (null)
        System.out.printf("\nMeu primeiro nome é %s\n\n", myAccount.getName());

        // Solicita e lê o nome
        System.out.println("Por favor, informe seu nome: ");
        String theName = input.nextLine(); // Lê uma linha de texto.
        myAccount.setName(theName); // insere theName em myAccount.
        System.out.println(); // Gera saída de uma linha em branco.

        // exibe o nome armazenado no objeto myAccount.
        System.out.printf("Seu nome é %s.\n", myAccount.getName());
    }
}
