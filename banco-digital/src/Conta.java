public abstract class Conta extends Banco implements IFConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double limite;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        super();
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo + limite){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }else{
            saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor + limite;
    }

    @Override
    public void transferir(double valor, IFConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo + limite;
    }

    protected void imprimirInforGeral() {
        super.imprimirNomeBanco();
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Titular: %s%n", this.cliente.getNome() + " " + this.cliente.getSobreNome());
        System.out.printf("Cpf: %s%n", this.cliente.getCpf());
        System.out.printf("Limite: R$ %.2f%n", this.limite);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
    }

}
