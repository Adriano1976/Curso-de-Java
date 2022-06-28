/*
— Suponha um negócio de banco que possui uma conta comum e uma conta para
empresas, sendo que a conta para empresa possui todos os membros da conta
comum, mais um limite de empréstimo e uma operação de realizar empréstimo
 */

package entities;

// É um tipo de associação que permite que uma classe herde todos dados e comportamentos de outra.
// Herança é uma associação entre classes (e não entre objetos)
public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
}
