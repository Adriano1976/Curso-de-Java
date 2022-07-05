package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // File — Representação abstrata de um arquivo e o seu caminho.
        File file = new File("C:\\Users\\ADRIANO\\Dropbox\\PC (2)\\Documents\\Dicas txt\\in.txt");
        // Scanner - Leitor de texto
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            // IOException — Indica que ocorreu uma exceção de E/S de algum tipo. Essa classe é a classe geral
            // de exceções produzidas por operações de E/S com falha ou interrompidas.
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
