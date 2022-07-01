/*
- Gere e imprima uma matriz 8 x 8 com valores aleatórios entre 0 e 19
 */

package Model.Arrays;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {

        Random random = new Random();
        int[][] matriz = new int[8][8];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("\n---- Matriz ---- ");

        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }

            System.out.println();
        }
    }
}
