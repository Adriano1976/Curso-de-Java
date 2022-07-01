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

public class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "DivisaoNaoExataException{" +
                "numerador=" + numerador +
                ", denominador=" + denominador +
                '}';
    }
}
