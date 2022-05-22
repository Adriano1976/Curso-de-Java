/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

package Model.Collection.map;

import java.util.*;

public class PopulacaoNodeste {
    public static void main(String[] args) {

        System.out.println("\nCrie um dicionário que ralacione os estados e suas repectivas populações: ");
        Map<String, Integer> populacaoEstadoNordeste = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 9187103);
            put("SE", 1547854);
        }};
        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nSubstitua a população do estado RN por: 3.534.165");
        populacaoEstadoNordeste.put("RN", 3534165);
        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " + "PB - 4.039.277: ");
        populacaoEstadoNordeste.put("PB", 4039277);
        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nExiba a população do estado de PE: " + populacaoEstadoNordeste.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem em que foram informado: ");
        Map<String, Integer> populacaoEstadoNordeste2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacaoEstadoNordeste2);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadoNordeste3 = new TreeMap<>(populacaoEstadoNordeste);
        System.out.println(populacaoEstadoNordeste3);

        Collection<Integer> populacao = populacaoEstadoNordeste.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadoNordeste.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) {
                estadoMaiorPopulacao = entry.getKey();
            }
        }
        for (Map.Entry<String, Integer> entry : populacaoEstadoNordeste.entrySet()) {
            if (entry.getValue().equals(Collections.min(populacao))) {
                estadoMenorPopulacao = entry.getKey();
            }
        }
        System.out.printf("\nExiba o estado com o maior população (%s) e seus respectivo valor: (%d)",
                estadoMaiorPopulacao, Collections.max(populacao));

        System.out.printf("\n\nExiba o estado com o menor população (%s) e seus respectivo valor: (%d)",
                estadoMenorPopulacao, Collections.min(populacao));

        int soma = 0;
        for (Integer integer : populacaoEstadoNordeste.values()) {
            soma += integer;
        }
        System.out.println("\n\nExiba a soma da população deses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário dos estados nordestino: " + (soma / populacaoEstadoNordeste.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        populacaoEstadoNordeste.values().removeIf(integer -> integer <= 4000000);
        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nApague o dicionário de estados com suas respectives populações estimadas: ");
        populacaoEstadoNordeste.clear();
        System.out.println(populacaoEstadoNordeste);

        System.out.println("\nConfira se a lista está vazia: " + populacaoEstadoNordeste.isEmpty());
    }
}
