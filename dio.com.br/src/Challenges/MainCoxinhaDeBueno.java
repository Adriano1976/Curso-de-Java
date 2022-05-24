/*
— Em 2015 um novo record foi alcançado na competição de Coxinhas de Bueno de Andrada,
onde Mónica mandou para dentro 43 coxinhas em apenas 10 minutos, passando se antecessor
que conseguiu comer, no mesmo tempo, 38 coxinhas em 2014.

— O restaurante especializado em coxinhas do pequeno distrito de Bueno de Andrada,
interior de São Paulo, organiza essa competição todos os anos, mas nunca conseguiram
entrar para o livro dos recordes, o Guinness Book. Para isso, o restaurante precisa
preencher informações sobre a competição, como o número de coxinhas consumidas pelos
competidores durante o evento.

— Porém, como jó foi informado, a especialidade deles é coxinha, não matemática,
então será que você pode ajudá-los? Com base no número total de coxinhas consumidas
e o número de participantes na competição, o dono do restaurante precisa que
desenvolva um programa para saber a quantidade média de coxinha que os participantes
da competição conseguem devorar.

— A entrada consiste de uma única linha que contém dois inteiros H e P (1 ≤ H, P ≤ 1000)
indicando respetivamente o número total de coxinhas consumidas e o número total de
participantes na competição.

— o seu programa deve produzir uma única linha com um número racional representando o
número médio de coxinhas consumidas pelos participantes. O resultado deve ser escrito
como um número racional com exatamente dois dígitos após o ponto decimal, arredondado
se necessário.
 */

package Challenges;

import java.util.Scanner;

public class MainCoxinhaDeBueno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número total de coxinhas consumidas e o número total de participante: ");
        // escaneia toda a linha, e não apenas a primeira palavra antes do espaço.
        String input = scan.nextLine();

        // pega a ‘string’ lida anteriormente e quebra ela em outras ‘strings’, usando os espaços (" ")
        String[] inputSplit = input.split(" ");
        // as variáveis "H" e "P" recebem cada uma dessas ‘strings’ que foram quebradas.
        String H = inputSplit[0];
        String P = inputSplit[1];

        // Double.parseDouble transforma o número na ‘string’ em double, para poder ser feita a operação matemática.
        double media = Double.parseDouble(H) / Double.parseDouble(P);

        // formata o símbolo de % para o formado float contido na variável "media", com duas casas decimais.
        System.out.printf("Foram consumidas uma média de %.2f coxinhas por participante.",media);
    }
}
