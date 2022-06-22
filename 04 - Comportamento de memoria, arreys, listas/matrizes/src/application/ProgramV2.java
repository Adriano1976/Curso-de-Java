/*
— Fazer um programa para ler dois números inteiros 'line' e 'column', e depois ler
uma matriz de L linhas por C colunas contendo números inteiros,
podendo haver repetições.
— Em seguida, ler um número inteiro X que pertence à matriz.
— Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver.
 */

package application;

import java.util.Scanner;

public class ProgramV2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the line and column: ");
        int line = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[line][column];

        System.out.println("Enter the numbers in the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter a integer number: ");
        int x = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }

        scanner.close();

    }
}
