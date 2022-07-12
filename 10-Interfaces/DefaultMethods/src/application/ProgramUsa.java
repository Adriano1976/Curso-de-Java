package application;

import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class ProgramUsa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Months: ");
        int months = scanner.nextInt();

        InterestService service = new UsaInterestService(1.0);
        double payment = service.payment(amount, months);

        System.out.println();
        System.out.println("Payment after " + months + " months: ");
        System.out.printf(String.format("$ %.2f", payment));
        System.out.println();

        scanner.close();
    }
}
