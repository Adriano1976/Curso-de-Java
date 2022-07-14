package Application;

import Entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramLog {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            // HashSet — mais rápido (operações O(1) em tabela hash) e não ordenado.
            Set<LogEntry> set = new HashSet<>();

            String line = reader.readLine();
            while (line != null) {

                String[] vect = line.split(" ");
                String userName = vect[0];
                Date moment = Date.from(Instant.parse(vect[1]));

                set.add(new LogEntry(userName, moment));

                line = reader.readLine();
            }

            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
