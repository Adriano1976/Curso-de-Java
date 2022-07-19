package Application;

import Entities.Product;
import Services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Application {

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

        ProductService productService = new ProductService();

        // Imprementation function thet receives other functions.
        double sum = productService.filteredSum(list, product -> product.getName().charAt(0) == 'T');

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
