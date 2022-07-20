package Application;

import Entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = reader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = reader.readLine();
            }

            double averagePrice = list.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, Double::sum) / list.size();
            System.out.println("Average price: " + String.format("%.2f", averagePrice));

            Comparator<String> comparator = Comparator.comparing(String::toUpperCase);

            List<String> names = list.stream()
                    .filter(product -> product.getPrice() < averagePrice)
                    .map(Product::getName)
                    .sorted(comparator.reversed())
                    .toList();
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
