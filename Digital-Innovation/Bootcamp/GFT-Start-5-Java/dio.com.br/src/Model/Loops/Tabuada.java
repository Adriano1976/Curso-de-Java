/*
- Desenvolva um gerador de tabuada capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10.
- O usuário deve informar de qual número ele deseja ver a tabuada.
- A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */

package Model.Loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tabuada: ");
        int tabuada = scanner.nextInt();

        System.out.println("\nTabuada de " + tabuada + "\n");
        for (int i = 1; i <= 10; i += 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
