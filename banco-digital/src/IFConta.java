public interface IFConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IFConta contaDestino);

    void imprimirSaldo();
    void imprimirExtrato();
}
