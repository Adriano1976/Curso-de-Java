package application;// Usando o construtor de entities.Account para inicializar a instância "name".
// variável no momento em que cada objeto entities.Account é criado.

import entities.Account;

public class AccountText2 {

    public static void main(String[] args) {

        // Cria dois objetos entities.Account
        Account account1 = new Account("Adriano Santos");
        Account account2 = new Account("Laura Beatriz");

        // Exibe o valor inicial de nome para cada entities.Account.
        System.out.printf("Account1 name is: %s\n", account1.getName());
        System.out.printf("Account2 name is: %s\n", account2.getName());
    }

} // Fim da classe AccountText.
