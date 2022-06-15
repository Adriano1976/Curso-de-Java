/*
— Em desempenho uma classe Estática sempre ficará em memória,
independente da sua utilização ela sempre estará a ocupar espaço em memória,
já uma classe instanciada ficará em memória apenas o tempo da sua utilização
e será removida da memória pelo GarbageCollector.
— Só uso a classe estática caso eu tenha apenas um valor para processar?
Isso mesmo, geralmente algo estático é teoricamente único.
*/

import entities.CalculatorV1;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class ProgramCircumferenceV2 {

    public static void main(String[] args) {
        Locale.setDefault(US);
        Scanner scanner = new Scanner(System.in);
        CalculatorV1 calculatorV1 = new CalculatorV1();

        System.out.print("Enter with radius: ");
        double radius = scanner.nextDouble();

        double circumference = calculatorV1.calculateCircumference(radius);
        double volume = calculatorV1.calculateVolume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.5f%n", calculatorV1.PI);

        scanner.close();
    }
}
