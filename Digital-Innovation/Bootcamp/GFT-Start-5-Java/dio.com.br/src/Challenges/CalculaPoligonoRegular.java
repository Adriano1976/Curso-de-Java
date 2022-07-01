/*
— Você deve escrever um programa que, dados o número e o comprimento dos lados
de um polígono regular, mostre o seu perímetro.
— A entrada tem dois inteiros positivos: N e L, que são, respetivamente, o número
de lados e o comprimento de cada lado de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).
— A saída é o perímetro P do polígono regular numa única linha.
 */

package Challenges;

import java.util.Scanner;

public class CalculaPoligonoRegular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        String[] split = N.split(" ");

        int perimetro = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
        System.out.println(perimetro);
    }
}
