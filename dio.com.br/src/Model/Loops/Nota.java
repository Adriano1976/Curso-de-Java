/*
- Faça um programa que peça uma nota, entre zero e dez.
- Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/

package Model.Loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota;

        System.out.print("Nota: ");
        nota = scan.nextFloat();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            System.out.print("Nota: ");
            nota = scan.nextFloat();
        }
    }
}
