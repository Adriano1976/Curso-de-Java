/*
— A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
— Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10).
— Em seguida, registre o aluguel dos estudantes.
— Para cada registro de aluguel, informar o nome e endereço eletrónico do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, o seu programa deve imprimir
um relatório de todas as ocupações do pensionato, por ordem de quarto,
conforme exemplo.
 */

package entities;

public class Rent {

    private String name;
    private String email;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + ", Email: " + email;
    }
}
