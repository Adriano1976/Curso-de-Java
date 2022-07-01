/*
— Dadas as seguintes informações de ‘id’ e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
 */

package Model.Collection.streamAPI;

import java.util.*;

public class Agenda {
    public static void main(String[] args) {

        System.out.println("\n\tOrdem aleatória dos contatos da agenda: ");
        Map<Integer, Contatos> agenda = new HashMap<>() {{
            put(1, new Contatos(101, "Roberto", "dos Santos", 958477854));
            put(4, new Contatos(104, "Josevaldo", "Santana", 945120214));
            put(3, new Contatos(103, "Carlota", "de Santana", 945120012));
            put(8, new Contatos(108, "Margarette", "Menezes", 978450001));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contatos> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n\tOrdem por Inserção dos contatos da agenda: ");
        Map<Integer, Contatos> ordemInsercao = new HashMap<>() {{
            put(1, new Contatos(101, "Roberto", "dos Santos", 958477854));
            put(4, new Contatos(104, "Josevaldo", "Santana", 945120214));
            put(3, new Contatos(103, "Carlota", "de Santana", 945120012));
            put(8, new Contatos(108, "Margarette", "Menezes", 978450001));
        }};
        System.out.println(ordemInsercao);
        for (Map.Entry<Integer, Contatos> entry : ordemInsercao.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n\tOrdem por Id dos contatos da agenda: ");
        Map<Integer, Contatos> ordemId = new TreeMap<>(agenda);
        System.out.println(ordemId);
        for (Map.Entry<Integer, Contatos> entry : ordemId.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n\tOrdem por Telefone dos contatos da agenda: ");
        Set<Map.Entry<Integer, Contatos>> ordemTelefone = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getTelefone()));
        ordemTelefone.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contatos> entry : ordemTelefone) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getTelefone() + ": " + entry.getValue().getNome());
        }

        System.out.println("\n\tOrdem por nome dos contatos: ");
        Set<Map.Entry<Integer, Contatos>> ordemNome = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        ordemNome.addAll(agenda.entrySet());
        ordemNome.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));
    }
}
