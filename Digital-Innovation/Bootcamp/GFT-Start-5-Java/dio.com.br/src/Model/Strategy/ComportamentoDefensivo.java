package Model.Strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se de forma defensiva...");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando de forma defensiva...");
    }

    @Override
    public void correr() {
        System.out.println("Correndo de forma defensiva...");
    }

    @Override
    public void parar() {
        System.out.println("Parando de forma defensiva...");
    }
}
