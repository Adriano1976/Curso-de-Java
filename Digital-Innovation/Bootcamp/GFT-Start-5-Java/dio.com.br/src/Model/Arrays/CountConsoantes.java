/*
- Faça um Programa que leia um vetor de 6 caracteres e diga quantas consoantes foram lidas.
- Imprima as consoantes encontradas pelo programa.
 */

package Model.Arrays;

import java.util.Scanner;

public class CountConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letras = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do {
            System.out.print("Letra: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                letras[count] = letra;
                quantConsoantes++;
            }

            count++;
        } while (count < letras.length);

        System.out.print("\nConsoantes: ");

        for (String consoante : letras) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        System.out.print("\nQuantidade de consoantes: " + quantConsoantes);
        System.out.print("\nQuantidade de letras: " + letras.length);
    }
}
