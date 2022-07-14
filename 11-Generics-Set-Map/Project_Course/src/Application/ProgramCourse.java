package Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramCourse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // HashSet — mais rápido (operações O(1) em tabela hash) e não ordenado.
        // Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode.
        Set<Integer> coursePython = new HashSet<>();
        Set<Integer> courseJava = new HashSet<>();
        Set<Integer> courseSQL = new HashSet<>();

        System.out.print("How many students for course Python? ");
        int quantityStudentsP = scanner.nextInt();
        for (int i = 0; i < quantityStudentsP; i++) {
            int numberStudents = scanner.nextInt();
            // add — Baseado em equals e hashCode.
            coursePython.add(numberStudents);
        }

        System.out.print("How many students for course Java? ");
        int quantityStudentsJ = scanner.nextInt();
        for (int i = 0; i < quantityStudentsJ; i++) {
            int numberStudents = scanner.nextInt();
            // add — Baseado em equals e hashCode.
            courseJava.add(numberStudents);
        }

        System.out.print("How many students for course SQL? ");
        int quantityStudentsSQL = scanner.nextInt();
        for (int i = 0; i < quantityStudentsSQL; i++) {
            int numberStudents = scanner.nextInt();
            // add — Baseado em equals e hashCode.
            courseSQL.add(numberStudents);
        }

        // HashSet — mais rápido (operações O(1) em tabela hash) e não ordenado.
        // Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode.
        Set<Integer> totalStudents = new HashSet<>(coursePython);
        // addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição.
        totalStudents.addAll(courseJava);
        totalStudents.addAll(courseSQL);

        System.out.println("Total students: " + totalStudents.size());

        scanner.close();
    }
}
