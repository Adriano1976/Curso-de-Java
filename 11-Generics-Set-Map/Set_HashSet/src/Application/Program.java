package Application;

import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        // HashSet — mais rápido (operações O(1) em tabela hash) e não ordenado.
        Set<String> set = new HashSet<>();

        set.add("TV Sansung 40 Pol");
        set.add("Notebook da LG 4GB HD 500 16 Pol");
        set.add("Tablet Sansung 8 Pol");
        set.add("Computador Desktop CPU + Monitor 18 pol");

        System.out.println(set.contains("Notebook da LG 4GB HD 500 16 Pol"));

        for (String product : set) {
            System.out.println(product);
        }
    }
}
