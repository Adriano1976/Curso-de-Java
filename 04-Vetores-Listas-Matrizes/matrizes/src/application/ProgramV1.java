/*
Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.
 */

package application;

import java.util.Scanner;

public class ProgramV1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int num = scanner.nextInt();
        int[][] mat = new int[num][num];

        System.out.println("Enter the numbers in the matrix: ");
        // Aqui foi refatorado a variável 'num' por 'mat.length'.
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        // Aqui foi refatorado a variável 'num' por 'mat.length'.
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        // Aqui foi refatorado a variável 'num' por 'mat.length'.
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count);

        scanner.close();
    }
}
