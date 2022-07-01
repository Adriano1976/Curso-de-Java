public class Pedido {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.gravar();
    }

    private EnviarEmails enviar = EnviarEmails.obterDadosEmail();


    public EnviarEmails getEnviar() {
        return enviar;
    }

    public void setEnviar(EnviarEmails enviar) {
        this.enviar = enviar;
    }

    public void gravar(){
        this.enviar.retornar("Pedido criado com sucesso!");
    }


}
