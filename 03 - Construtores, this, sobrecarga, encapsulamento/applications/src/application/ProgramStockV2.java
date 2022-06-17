package application;

import entities.ProductV2;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStockV2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Adding product to stock
        System.out.println();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = scanner.nextInt();

        // Com o intuito de evitar a existência de produtos sem nome e sem preço, é possível
        //fazer com que seja “obrigatória” a iniciação desses valores
        ProductV2 product = new ProductV2(name, price, quantity);

        // Printing product data.
        System.out.println();
        System.out.println("Product data: " + product);

        // Adding new product to stock
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = scanner.nextInt();
        product.addProducts(quantity);

        // Printing the data of the changed products.
        System.out.println("Updated data: " + product);

        // Removing product from stock
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        // Printing the data of the changed products.
        System.out.println("Updated data: " + product);

        scanner.close();
    }
}
