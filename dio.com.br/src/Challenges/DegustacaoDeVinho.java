/*
— Degustação de vinho às escuras é a habilidade de identificar um vinho usando apenas os seus
sentidos do olfato e paladar.

— Durante uma competição de degustação, uma garrafa de vinho é aberta e dividia em taças
para que os cinco competidores possam provar. Eles podem cheirar, saborear e avaliar a bebida
para conseguir identificar qual o tipo do vinho, sendo: (1) Cabernet; (2) Merlot; (3) Pinot Noir.
No final, as respostas são verificadas para determinar o número de suposições corretas.

— Dado o qual foi o tipo do vinho e as respostas fornecidas, determine o número de participantes
que receberam a resposta correta.

— A primeira linha contém um inteiro T representando o tipo de vinho (1 ≤ T ≤ 4).
A segunda linha contém cinco inteiros A, B, C, D e E, que indica a resposta dada
por cada competidor (1 ≤ A, B, C, D, E ≤ 4).
*/

package Challenges;

import java.util.Scanner;

public class DegustacaoDeVinho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tipo de vinho: ");
        String tipoDeVinho = scan.nextLine(); // Escaneia toda a linha, e não apenas a primeira palavra antes do espaço.

        System.out.print("Informe a resposta dos competidores: ");
        String respostasCompetidores = scan.nextLine();

        // Pega a ‘string’ lida anteriormente e quebra ela em outras ‘strings’, usando os espaços (" ")
        // para indicar a separação entre elas.
        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;
        for (String resposta : respostasCompetidoresSplit) {
            if (resposta.equals(tipoDeVinho)) // Equals serve para comparar uma informação com outra. Sendo iguais, será true.
                count++;
        }

        System.out.print("O número de concorrentes que obtiveram a resposta correta foi " + count + ".");
    }
}
