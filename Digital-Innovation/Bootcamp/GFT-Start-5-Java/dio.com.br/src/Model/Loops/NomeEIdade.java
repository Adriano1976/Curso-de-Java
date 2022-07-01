/*
- Faça um programa que leia conjuntos de três valores,
o primeiro representando o nome do aluno,
o segundo represente o sobrenome do aluno e
o terceiro representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

package Model.Loops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;

        while (true) {
            System.out.print("Nome: ");
            nome = scan.next();

            if (nome.equals("0"))
                break;

            System.out.print("Sobrenome: ");
            sobrenome = scan.next();

            System.out.print("Idade: ");
            idade = scan.nextInt();

            System.out.println(
                    "Seu nome é " + nome + " " + sobrenome + " e você tem " + idade + ".\n"
            );
        }

        System.out.println("\nFinalizando programa ...");

    }
}
