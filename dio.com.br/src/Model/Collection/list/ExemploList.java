package Model.Collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("\nCrie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(1.5);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Exiba a posição da nota 7.0: " + notas.indexOf(7d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));
        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a média das notas: " + (soma / notas.size()));

        System.out.println("\nRemova a nota 1.5: ");
        notas.remove(1.5d);
        System.out.println(notas);

        System.out.println("\nRemova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        notas.removeIf(next -> next < 7);
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());
    }
}
