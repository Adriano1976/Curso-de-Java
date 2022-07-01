package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramV1 {

    public static void main(String[] args) {

        File file = new File("C:\\\\temp\\\\in.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
            // Bloco finally: É um bloco que contém código a ser executado independentemente de ter
            // ocorrido ou não uma exceção, como fechar um arquivo, conexão de banco de dados e outros.
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
