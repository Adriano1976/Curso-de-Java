package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println();
        System.out.print("Enter file path: ");
        String sourceFileStr = scanner.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile))) {

            String itemCsv = bufferedReader.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = bufferedReader.readLine();
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Product item : list) {
                    bufferedWriter.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bufferedWriter.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}
