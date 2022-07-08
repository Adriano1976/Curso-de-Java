package application;

import model.entities.Contrato;
import model.entities.Parcelas;
import model.services.ServicoContrato;
import model.services.ServicoPayPal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner input = new Scanner(System.in)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println();
            System.out.println("Informe os dados do contrato:");
            System.out.print("Número do contrato: ");
            int numeroContrato = input.nextInt();
            System.out.print("Data (dd/mm/yyyy): ");
            input.nextLine();
            Date dataContrato = dateFormat.parse(input.nextLine());
            System.out.print("Valor do contrato: ");
            double valorContrato = input.nextDouble();
            System.out.print("Número de parcelas: ");
            int numeroParcelas = input.nextInt();

            Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);
            ServicoContrato servicoContrato = new ServicoContrato(new ServicoPayPal());

            servicoContrato.processandoContrato(contrato, numeroParcelas);

            System.out.println();
            System.out.println("PARCELAS DO CONTRATO");
            System.out.println();
            double valorTotal = 0.0;
            for (Parcelas parcelas : contrato.getParcelas()) {
                System.out.println(parcelas);
                valorTotal = valorTotal + parcelas.getValorParcela();
            }

            System.out.println();
            System.out.println("Taxa cobrada: R$ " + String.format("%.2f", valorTotal - contrato.getValorContrato()));
            System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));
        } catch (ParseException e) {
            System.out.println("Formato da data inválida.");
        } catch (RuntimeException e) {
            System.out.println("Erro de digitação inesperado");
        }
    }
}
