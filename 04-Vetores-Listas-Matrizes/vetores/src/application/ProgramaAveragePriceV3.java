/*
— Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene o N, alturas num vetor. Em seguida, mostrar a
altura média dessas pessoas.
 */

package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAveragePriceV3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of products: ");
        int num = scanner.nextInt();
        Product[] vect = new Product[num];

        System.out.print("Enter product description and price: \n");
        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / num;

        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        scanner.close();
    }
}
