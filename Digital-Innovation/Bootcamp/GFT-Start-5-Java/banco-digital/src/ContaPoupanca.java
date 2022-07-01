import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("\n===== Saldo da Conta Poupança =====");
        System.out.println("Data: " + dataAtual.format(LocalDateTime.now()));
        super.imprimirInforGeral();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n===== Extrato da Conta Poupança =====");
        System.out.println("Data: " + dataAtual.format(LocalDateTime.now()));
        super.imprimirExtratoGeral();
    }
}
