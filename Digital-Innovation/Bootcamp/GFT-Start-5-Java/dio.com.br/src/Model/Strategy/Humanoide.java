package Model.Strategy;

public class Humanoide {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }

    public void voltar(){
        comportamento.voltar();
    }

    public void correr(){
        comportamento.correr();
    }

    public void parar(){
        comportamento.parar();
    }
}
