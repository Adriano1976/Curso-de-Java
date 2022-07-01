/*
— Em desempenho uma classe Estática sempre ficará em memória,
independente da sua utilização ela sempre estará a ocupar espaço em memória,
já uma classe instanciada ficará em memória apenas o tempo da sua utilização
e será removida da memória pelo GarbageCollector.
— Só uso a classe estática caso eu tenha apenas um valor para processar?
Isso mesmo, geralmente algo estático é teoricamente único.
*/

import entities.CalculatorV2;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCircumferenceV3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter with radius: ");
        double radius = scanner.nextDouble();

        double circumference = CalculatorV2.calculateCircumference(radius);
        double volume = CalculatorV2.calculateVolume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.5f%n", CalculatorV2.PI);

        scanner.close();
    }
}
