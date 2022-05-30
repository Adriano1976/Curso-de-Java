package Model.Strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se de forma normal...");
    }

    @Override
    public void voltar() {
        System.out.println("Voltando de forma normal...");
    }

    @Override
    public void correr() {
        System.out.println("Correndo de forma normal...");
    }

    @Override
    public void parar() {
        System.out.println("Parando de forma normal...");
    }
}
