package entities;// Classe entities.AccountBank com uma variável de instância balance do tipo double e um construtor
// com método deposit que executa a validator.

public class AccountBank {

    private String name; // variável de instância
    private double balance; // variável de instância

    // Construtor de entities.AccountBank que recebe dois parâmetros
    public AccountBank(String name, double balance) {

        this.name = name; // atribui 'name' á variável de instância 'name'

        // valida que o balance é maior que 0.0; se não for a variável de instância, mantém seu valor inicial 0.0
        if (balance > 0.0) // se o saldo for válido
            this.balance = balance; // o atribui à variável de instância balance
    }

    // método que deposita apenas uma quantia válida no saldo
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance += depositAmount;
    }

    // método retorna o saldo da conta
    public double getBalance() {

        return balance;
    }

    // método que define o nome
    public void setName(String name) {
        this.name = name;
    }

    // método que retorna o nome
    public String getName() {
        return name; // retorna o valor de 'name' ao chamador.
    } // fim do método getName
} // fim da classe entities.AccountBank
