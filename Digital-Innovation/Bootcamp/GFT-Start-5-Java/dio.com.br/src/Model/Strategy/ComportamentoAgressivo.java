package Model.Strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se de forma agressiva...");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando de forma agressiva...");
    }

    @Override
    public void correr() {
        System.out.println("Correndo de forma agressiva...");
    }

    @Override
    public void parar() {
        System.out.println("Parando de forma agressiva...");
    }
}
