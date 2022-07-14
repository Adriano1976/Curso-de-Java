package Application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        // TreeSet — mais lento e ordenado pelo compareTo do objeto (ou Comparator).
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        // addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição.
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // retainAll(other) - interseção: remove do conjunto os elementos não contitos em other.
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //  removeAll(other) - diferença: remove do conjunto os elementos contidos em other.
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
