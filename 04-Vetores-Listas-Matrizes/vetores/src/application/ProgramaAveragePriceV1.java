/*
— Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene o N, alturas num vetor. Em seguida, mostrar a
altura média dessas pessoas.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaAveragePriceV1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Data imput
        System.out.print("Enter a quantidy of height: ");
        int num = scanner.nextInt();
        double[] vect = new double[num];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < num; i++) {
            vect[i] = scanner.nextDouble();
        }

        // Data processing
        double sum = 0.0;
        for (int i = 0; i < num; i++) {
            sum += vect[i];
        }
        double avg = sum / num;

        // Data output
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        scanner.close();
    }
}
