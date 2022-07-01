package application;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Digite o primeiro número inteiro: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);
    }
}
