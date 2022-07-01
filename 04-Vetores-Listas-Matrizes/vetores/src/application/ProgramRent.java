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

package application;

import entities.Rent;

import java.util.Scanner;

public class ProgramRent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int num = scanner.nextInt();
        System.out.println("What's your data and room? ");

        for (int i = 1; i <= num; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + " - " + vect[i]);
            }
        }

        scanner.close();
    }
}
