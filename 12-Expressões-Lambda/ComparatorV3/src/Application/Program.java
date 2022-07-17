package Application;

import Entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV Sansung", 900.00));
        list.add(new Product("Notebook LG", 1200.00));
        list.add(new Product("Tablet Lenovo", 450.00));
        list.add(new Product("Computador Clone", 1250.00));
        list.add(new Product("Geladeira Brastemp", 1450.00));
        list.add(new Product("Iphone 8 20G", 1280.00));

        // Comparator (expressão) lambda "direto no argumento"
        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
