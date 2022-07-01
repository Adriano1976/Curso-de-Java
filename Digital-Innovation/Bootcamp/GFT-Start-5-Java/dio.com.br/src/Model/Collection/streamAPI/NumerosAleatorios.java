package Model.Collection.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumerosAleatorios {
    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5", "7", "4");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).toList();

        System.out.println("\nListando os números aleatórios da lista: " + numerosAleatorios);

        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante: ");
        numerosAleatoriosInteger.stream().skip(3).forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream().distinct().count();
        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("\nMostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream().mapToInt(Integer::intValue).min().ifPresent(System.out::println);

        int somaDosNumerosPares = numerosAleatoriosInteger.stream().filter(i -> (i % 2 == 0)).mapToInt(Integer::intValue).sum();
        System.out.println("\nPegue apenas os números ímpares e some: " + somaDosNumerosPares);

        System.out.println("\nMostre a lista na ordem numérica: ");
        List<Integer> numerosEmOrdemNatural = numerosAleatoriosInteger.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(numerosEmOrdemNatural);

        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5: ");
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream().collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}
