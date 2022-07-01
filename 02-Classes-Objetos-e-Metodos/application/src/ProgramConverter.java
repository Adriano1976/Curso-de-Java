import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramConverter {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarQuantity = scanner.nextDouble();

        double convertedDollar = CurrencyConverter.calculateConvertion(dollarPrice, dollarQuantity);
        double iof = CurrencyConverter.calculateIOF(convertedDollar);

        System.out.printf("Amount to be bought in reais: R$ %.2f%n", convertedDollar - iof);
        System.out.printf("IOF to be taxed in reais: R$ %.2f%n", iof);

        scanner.close();
    }
}
