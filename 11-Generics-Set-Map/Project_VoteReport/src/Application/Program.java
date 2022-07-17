package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // LinkedHashMap — Não admite repetições do objeto chave e elementos na ordem em que são adicionados.
        Map<String, Integer> votos = new LinkedHashMap<>();

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line = reader.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                // containsKey(key) - Baseado em equals e hashCode
                if (votos.containsKey(name)) {
                    int votesSoFar = votos.get(name);
                    votos.put(name, count + votesSoFar);
                } else {
                    votos.put(name, count);
                }

                line = reader.readLine();
            }

            // keySet() - retorna um Set<K>
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
