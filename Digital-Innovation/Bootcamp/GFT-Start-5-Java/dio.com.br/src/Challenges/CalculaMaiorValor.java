/*
— Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido
e a posição dentre os 100 valores lidos.
— O arquivo de entrada contém 100 números inteiros, positivos e distintos.
— Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 */

package Challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CalculaMaiorValor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        Integer max = Collections.max(numeros);
        System.out.println(max);
        int position = numeros.indexOf(max) + 1;
        System.out.println(position);
    }
}
