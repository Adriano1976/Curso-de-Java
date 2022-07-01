/*
- Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os num vetor.
- Ao final, mostre os números e seus sucessores e antecessores.
 */


package Model.Arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("\nNumeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSeus Antecessores: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nSeus Sucessores: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }

        System.out.println("\n\nPrograma finalizando ...");

    }
}
