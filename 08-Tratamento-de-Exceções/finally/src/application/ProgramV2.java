package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramV2 {

    public static void main(String[] args) {

        File file = new File("C:\\\\temp\\\\in.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }
}
