/*
- Fazer um programa para ler os valores da largura e altura de um retângulo.
Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 */

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println();
        System.out.printf("AREA: %.2f%n", rectangle.area());
        System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());

        scanner.close();
    }
}
