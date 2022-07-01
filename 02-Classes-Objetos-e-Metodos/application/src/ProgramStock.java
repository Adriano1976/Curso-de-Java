import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStock {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        int quantity;

        // Adding product to stock
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price: ");
        product.price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        // Printing product data.
        System.out.println();
        System.out.println("Product data: " + product);

        // Adding new product to stock
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = scanner.nextInt();
        product.addProducts(quantity);

        // Printing the data of the changed products.
        System.out.println();
        System.out.println("Updated data: " + product);

        // Removing product from stock
        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        // Printing the data of the changed products.
        System.out.println();
        System.out.println("Updated data: " + product);

        scanner.close();
    }
}
