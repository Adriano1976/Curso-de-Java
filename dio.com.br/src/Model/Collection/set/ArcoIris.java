/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

package Model.Collection.set; // Não permite elementos duplicados e nem possui índice.

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {

        System.out.println("\nCrie um conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Violeta");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Vermelho");
        System.out.println(coresArcoIris);

        System.out.println("\nExiba todas as cores do arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        System.out.println("\nA quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("\nExiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        for (String cor : coresArcoIris2) {
            System.out.println(cor);
        }

        System.out.println("\nExiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho")
        );
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("\nExiba todas as cores que começam com a letra 'V': ");
        for (String cor : coresArcoIris) {
            if (cor.startsWith("V")) {
                System.out.println(cor);
            }
        }

        System.out.println("\nRemova todas as cores que não começam com a letra 'V': ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) {
                iterator2.remove();
            }
        }
        System.out.println(coresArcoIris);

        System.out.println("\nLimpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("\nConfira se o conjunto está vazio: " + coresArcoIris);

    }
}
