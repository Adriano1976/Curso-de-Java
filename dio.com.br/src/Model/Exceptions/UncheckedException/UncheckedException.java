/*
— Herdam da classe RuntimeException ou da classe Error.
— O compilador não verifica o código para ver se a exceção foi capturada ou declarada.
— Se uma exceção não verificada ocorrer e não tiver sido capturada, o programa terminará ou executará com resultados inesperados.
— Em geral, podem ser evitadas com uma codificação adequada.
 */

package Model.Exceptions.UncheckedException;

import javax.swing.*;

// Fazendo a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String numerador = JOptionPane.showInputDialog("Informe o numerador: ");
            String denominador = JOptionPane.showInputDialog("Informe o denominador: ");

            // try, catch, finally: cada uma dessas palavras, juntas, definem blocos para o tratamento de exceções.
            try {
                int resultado = dividir(Integer.parseInt(numerador), Integer.parseInt(denominador));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro!\nErro: " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.\nErro: " + e.getMessage());
            } finally {
                System.out.println("Chegou no finally!");
            }

        } while (continueLooping);

        System.out.println("O código continua...");
    }

    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}
