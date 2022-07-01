/*
— Programadores podem achar útil declarar a suas próprias classes de exceção.
— Essas Exceptions são específicas aos problemas que podem ocorrer quando outro programador
empregar a suas classes reutilizáveis.
— Uma nova classe de exceção deve estender uma classe de exceção existente que assegura que a
classe pode ser utilizada com o mecanismo de tratamento de exceções, logo essas Exceções
customizadas são derivadas da classe Exception.
— Importante: Antes de criar a nossa própria exceção, é recomendado verificar se já existe alguma exceção na biblioteca Java que já nos forneça o que precisamos. Afinal, não queremos reinventar a roda!
 */

package Model.Exceptions.ExceptionPersonalizada;

import javax.swing.*;

public class ExceptionCurstom_2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            System.out.println("O programa continua...");
        }
    }
}
