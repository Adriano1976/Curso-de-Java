/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

package Model.Loops;

import java.util.Scanner;

public class NumPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                quantPares++;
            } else {
                quantImpares++;
            }

            count++;
        } while (count < quantNumeros);

        System.out.println();
        System.out.println("Quantidade de números pares: " + quantPares);
        System.out.println("Quantidade de números impares: " + quantImpares);
    }
}
