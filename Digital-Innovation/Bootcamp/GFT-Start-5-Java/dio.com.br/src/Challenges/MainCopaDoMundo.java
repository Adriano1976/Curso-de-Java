package Challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainCopaDoMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o número total de espaços no álbum: ");
        int numTotal = scanner.nextInt();

        System.out.print("Informe o número de figurinhas já compradas: ");
        int numFigCompradas = scanner.nextInt();

        Set<Integer> setFig = new HashSet<>();
        for (int i = 0; i < numFigCompradas; i++){
            System.out.print("Informe o número de figurinhas: ");
            setFig.add(scanner.nextInt());
        }

        System.out.println(numTotal - setFig.size());
    }
}
