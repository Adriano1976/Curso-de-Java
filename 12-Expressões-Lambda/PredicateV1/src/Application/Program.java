package Application;

import Entities.Product;
import Util.ProdutctPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV Sansung", 900.00));
        list.add(new Product("Notebook LG", 1200.00));
        list.add(new Product("Tablet Lenovo", 450.00));
        list.add(new Product("Computador Clone", 1250.00));
        list.add(new Product("Geladeira Brastemp", 1450.00));
        list.add(new Product("Iphone 8 20G", 1280.00));
        list.add(new Product("Secador de Cabela", 89.00));
        list.add(new Product("Fritadeira Amvox", 59.00));

        // 1.ª Version: Implementação da ‘interface’.
        list.removeIf(new ProdutctPredicate());

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
