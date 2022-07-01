/*
— Num banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir a sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
- Importante: visto que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois, uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
- Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por depósitos, e só diminui por saques. Para cada saque
realizado, o banco cobra uma taxa de $5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
— Deve fazer um programa que realize o cadastro de uma conta, dando opção para ser ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.
 */

package entities;

public class Account {

    private final int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double inicialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount + 5.0) {
            System.out.println("Insufficient funds. Balance: " + getBalance());
        } else {
            balance -= amount + 5.0;
        }
    }

    public String toString() {
        return "Account: " + number
                + ", Holder: " + holder
                + ", Balance: $ " + String.format("%.2f", balance);
    }
}
