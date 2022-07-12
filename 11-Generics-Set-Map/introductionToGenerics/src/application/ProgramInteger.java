package application;

import services.PrintService;

import java.util.Scanner;

public class ProgramInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many values? ");
        int number = scanner.nextInt();

        PrintService<Integer> list = new PrintService<>();

        for (int i = 0; i < number; i++) {
            Integer value = scanner.nextInt();
            list.addValue(value);
        }

        list.print();
        Integer valueFirst = list.first();
        System.out.println("First: " + valueFirst);

        scanner.close();
    }
}
