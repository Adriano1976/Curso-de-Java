/*
<< Padrão Comportamentol >>
- Strategy -> Simplificar a variação de algoritmos para a resolução de um mesmo problema.
 */

package Model.Strategy;

public class Test {

    public static void main(String[] args) {

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Humanoide humanoide = new Humanoide();
        humanoide.setComportamento(normal);
        humanoide.mover();
        humanoide.mover();
        humanoide.setComportamento(defensivo);
        humanoide.mover();
        humanoide.setComportamento(agressivo);
        humanoide.mover();
        humanoide.mover();
        humanoide.correr();
        humanoide.correr();
        humanoide.parar();
        humanoide.setComportamento(normal);
        humanoide.voltar();
        humanoide.correr();
        humanoide.setComportamento(agressivo);
        humanoide.parar();
    }
}
