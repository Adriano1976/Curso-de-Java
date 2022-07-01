/*
- Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */

package Model.Loops;

import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scanner.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao *= i;
        }

        System.out.println(multiplicacao);
    }
}
