/*
- Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
— As perguntas são as seguintes:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
— Se a pessoa responder positivamente 2 questões, ela deve ser classificada como "Suspeita".
- Se a pessoa responder positivamente entre 3 e 4, ela deve ser classificada como "Cúmplice".
- Se a pessoa responder positivamente 5 questões, ela deve ser classificada como "Assasina".
- Caso contrário, ela será classificada como "Inocente".
 */

package Model.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificadorDeCrime {
    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String resposta;

        System.out.println("\n---------- Perguntas Investigativas: [S/N] ----------\n");

        System.out.print("1. Telefonou para a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("2. Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("3. Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("4. Devia para a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.print("5. Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println();
        System.out.println(respostas);

        int count = 0;
        for (String resp : respostas) {
            if (resp.contains("s")) {
                count++;
            }
        }

        switch (count) {
            case 2 -> System.out.print(">> SUSPEITA <<");
            case 3, 4 -> System.out.print(">> CÚMPLICE <<");
            case 5 -> System.out.print(">> ASSASSINO <<");
            default -> System.out.print(">> INOCENTE <<");
        }
    }
}
