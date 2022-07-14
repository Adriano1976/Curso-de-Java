package Application;

import Entities.Product;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // TreeSet — mais lento e ordenado pelo compareTo do objeto (ou Comparator).
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV Sansung 40 Pol", 900.00));
        set.add(new Product("Geladeira Frosfree 450lt", 2250.00));
        set.add(new Product("Notebook LG 16 Pol", 1200.00));
        set.add(new Product("Iphone X8 32GB Interno", 3580.00));
        set.add(new Product("Smarthphone Sansung 12GB", 1200.00));
        set.add(new Product("Cama casal Box Ortobom", 880.00));
        set.add(new Product("Fogão 5 bocas Brastemp", 1790.00));
        set.add(new Product("Mesa com 4 Cadeiras", 395.00));

        System.out.println();
        for (Product product : set) {
            System.out.println(product);
        }
    }
}
