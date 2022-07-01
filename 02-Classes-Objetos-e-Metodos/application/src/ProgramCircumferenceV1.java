/*
— Em desempenho uma classe Estática sempre ficará em memória,
independente da sua utilização ela sempre estará a ocupar espaço em memória,
já uma classe instanciada ficará em memória apenas o tempo da sua utilização
e será removida da memória pelo GarbageCollector.
— Só uso a classe estática caso eu tenha apenas um valor para processar?
Isso mesmo, geralmente algo estático é teoricamente único.
*/

import java.util.Locale;
import java.util.Scanner;

public class ProgramCircumferenceV1 {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter with radius: ");
        double radius = scanner.nextDouble();

        double circumference = calculateCircumference(radius);
        double volume = calculateVolume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.5f%n", PI);

        scanner.close();
    }

    public static double calculateCircumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double calculateVolume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
