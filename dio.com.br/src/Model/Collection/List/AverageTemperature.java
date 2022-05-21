/*
- Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em lista.
- Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima da média.
 */

package Model.Collection.List;

import java.util.ArrayList; // Deve ser usado onde mais operações de pesquisa são necessárias.
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        // Adicionando as temperaturas na lista:
        int count = 0;
        while (count != 6) {

            System.out.print("Digite a temperatura: ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("---------------------------------");

        // exibindo todas as temperaturas.
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(temperatura -> System.out.print(temperatura + "°C | "));

        // Calculando e exibindo a média das temperaturas.
        double media = temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f°C\n", media);

        // Exibindo as temperaturas acima da média.
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream().filter(temp -> temp > media).forEach(temp -> System.out.printf("%.1f°C | ", temp));

        // Exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0) -> System.out.printf("1 - Janeiro: %.1f°C\n", temp);
                    case (1) -> System.out.printf("2 - Fevereiro: %.1f°C\n", temp);
                    case (2) -> System.out.printf("3 - Março: %.1f°C\n", temp);
                    case (3) -> System.out.printf("4 - Abril: %.1f°C\n", temp);
                    case (4) -> System.out.printf("5 - Maio: %.1f°C\n", temp);
                    case (5) -> System.out.printf("6 - Junho: %.1f°C\n", temp);
                    default -> System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}
