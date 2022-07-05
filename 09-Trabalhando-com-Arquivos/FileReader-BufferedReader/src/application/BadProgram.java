package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BadProgram {

    public static void main(String[] args) {

        String path = "C:\\Users\\ADRIANO\\Dropbox\\PC (2)\\Documents\\Dicas txt\\in.txt";
        // BufferedReader (mais rápido).
        BufferedReader bufferedReader = null;
        // FileReader (stream de leitura de caracteres a partir de arquivos).
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
                if (fileReader != null) fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
