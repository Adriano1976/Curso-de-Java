package aaplication;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            if (type == 'c' || type == 'C') {
                // Polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos.
                list.add(new Product(name, price)); // Product added to the mother class.
            } else if (type == 'u' || type == 'U') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scanner.next());
                // Polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos.
                list.add(new UsedProduct(name, price, date)); // Product added to the child class.
            } else {
                System.out.print("Customs free: ");
                double customsFree = scanner.nextDouble();
                // Polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos.
                list.add(new ImportedProduct(name, price, customsFree)); // Product added to the child class.
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        scanner.close();
    }
}
