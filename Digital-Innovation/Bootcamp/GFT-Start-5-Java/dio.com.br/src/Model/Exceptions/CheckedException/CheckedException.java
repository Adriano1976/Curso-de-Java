/*
— As exceções são herdadas da classe Exception, mas não de RuntimeException.
— O compilador impõe um requisito do tipo "capturar ou declarar".
— O compilador verifica cada chamada do método e declaração de método para determinar se o método lança (throws) exceções verificadas.
— Se lançar, o compilador assegura que a exceção verificada é capturada ou declarada numa cláusula throws.
— Caso não capturada nem declarada, ocorre um erro de compilação.
 */

package Model.Exceptions.CheckedException;

import javax.swing.*;
import java.io.*;

// Imprimir um arquivo no console.
public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romance-black-crouch.txt";

        // try, catch, finally: cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo que você deseja imprimir!\nErro: " + e.getCause());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado!\nEntre em contato com o suporte!\nErro: " + e.getCause());
        } finally {
            System.out.println("\nChegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    // throws: declara que um método pode lançar uma ou várias exceções.
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {

        File file = new File(nomeDoArquivo);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getName()));
        String line = bufferedReader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        } while (line != null);
        bufferedWriter.flush();
        bufferedReader.close();
    }
}
