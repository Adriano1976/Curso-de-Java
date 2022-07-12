package application;

import services.PrintService;

import java.util.Scanner;

public class ProgramString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many values? ");
        int number = scanner.nextInt();

        PrintService<String> list = new PrintService<>();

        for (int i = 0; i < number; i++) {
            String value = scanner.next();
            list.addValue(value);
        }

        list.print();
        String valueFirst = list.first();
        System.out.println("First: " + valueFirst);

        scanner.close();
    }
}
