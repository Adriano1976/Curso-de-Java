public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("\n===== Saldo da Conta Poupança =====");
        super.imprimirInforGeral();
    }
}
