package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Bloco try: Contém o código que representa a execução normal do trecho de código que
        // pode acarretar uma exceção
        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        }
        // Bloco catch: Contém o código a ser executado caso uma exceção ocorra, pelo qual
        // deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido).
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        System.out.println("End of program");

        scanner.close();
    }
}
