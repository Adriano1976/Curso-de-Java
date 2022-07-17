package Application;

import Entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        Map<Product, Double> stock = new HashMap<>();

        Product product = new Product("TV Sansung", 900.00);
        Product product1 = new Product("Notebook LG", 1200.00);
        Product product2 = new Product("Tablet Lenovo", 580.00);

        stock.put(product, 1000.00);
        stock.put(product1, 2000.00);
        stock.put(product2, 15000.00);

        Product product3 = new Product("TV Sansung", 900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(product3));
    }
}
