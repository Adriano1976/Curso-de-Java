package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramCreateText {

    public static void main(String[] args) {

        String[] lines = new String[]{
                "01 – O curso completo de Banco de Dados e SQL, sem mistérios",
                "02 – O que é Business Intelligence? Teoria sem mistérios!",
                "03 – Business Intelligence SQL – ETL Integration Services 2016",
                "04 – Business Intelligence – SQL Server e Analysis Services 2016",
                "05 – Business Intelligence com Power BI – Estudos de Caso",
                "06 – Business Intelligence com Tableau Desktop"
        };

        String path = "C:\\Users\\ADRIANO\\Dropbox\\PC (2)\\Documents\\Dicas txt\\businessIntelligence-new.txt";

        // FileWriter — Stream de escrita de caracteres em arquivos, creando/ recriando o arquivo.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {

            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
