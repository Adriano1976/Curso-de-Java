/*
- Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter with student data: ");
        System.out.print("Name: ");
        student.name = scanner.nextLine();
        System.out.println("Grades 3: ");
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        System.out.println();
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println(">> FAILED <<");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println(">> PASS <<");
        }
    }
}
