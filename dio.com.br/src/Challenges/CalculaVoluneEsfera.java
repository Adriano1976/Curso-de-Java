package Challenges;

import java.util.Scanner;

public class CalculaVoluneEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.print("RAIO: ");
        double R = scanner.nextDouble();
        double volume = ( 4.0 / 3f ) * pi * (Math.pow(R, 3.0));
        System.out.printf("VOLUME = %.3f%n", volume );
    }
}
