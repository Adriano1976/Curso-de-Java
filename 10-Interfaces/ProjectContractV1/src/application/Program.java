package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println();
            System.out.println("Enter contract data");
            System.out.print("Number: ");
            int number = scanner.nextInt();
            System.out.print("Date (dd/mm/yyyy): ");
            Date date = simpleDateFormat.parse(scanner.next());
            System.out.print("Contract value: ");
            double totalValue = scanner.nextDouble();

            Contract contract = new Contract(number, date, totalValue);

            System.out.print("Enter number of installments: ");
            int numberInstallments = scanner.nextInt();

            ContractService contractService = new ContractService(new PaypalService());

            contractService.processContract(contract, numberInstallments);

            System.out.println();
            System.out.println("Installments:");
            double totalValueInstallment = 0.0;
            for (Installment installment : contract.getInstallments()) {
                System.out.println(installment);
                totalValueInstallment = totalValueInstallment + installment.getAmount();
            }
            System.out.println();
            System.out.println("Tax value: " + String.format("%.2f", totalValueInstallment - contract.getTotalValue()));
            System.out.println("Total value: " + String.format("%.2f", totalValueInstallment));

        } catch (ParseException e) {
            System.out.println("Invalid date format");

        } catch (RuntimeException e) {
            System.out.println("Unexpected error");

        }
    }
}
