package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // Inserir os elementos na lista
        list.add("Maria Rafiza");
        list.add("Bob Marley");
        list.add("Nadja Santarem");
        list.add("Narcosy Cortez");
        list.add("Roberto Macedo");
        list.add("Luiz Augusto Barreto");
        list.add("Karla Balbino");
        list.add("Carlos Vasconcelos");
        list.add("Adriano Santana");
        list.add("Silvana Nascimento");
        list.add(2, "Rafaela katharina");

        // Verifica o tamanho da lista.
        System.out.println(list.size());
        // Obs.: Para cada objeto 'x' contido em list, faça:
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------------------");

        // Remover elementos da lista com base em predicado
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        // Encontrar posição de elemento
        System.out.println("Index of Bob Marley: " + list.indexOf("Bob Marley"));
        System.out.println("Index of Narcosy Cortez: " + list.indexOf("Narcosy Cortez"));

        System.out.println("---------------------------------");

        // Filtrar lista com base em predicado
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        // Encontrar primeira ocorrência com base em predicado
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
