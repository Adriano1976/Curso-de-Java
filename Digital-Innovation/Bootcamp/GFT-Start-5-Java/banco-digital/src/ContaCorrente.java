import java.time.LocalDateTime;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("\n===== Saldo da Conta Corrente =====");
        System.out.println("Data: " + dataAtual.format(LocalDateTime.now()));
        super.imprimirInforGeral();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n===== Extrato da Conta Corrente =====");
        System.out.println("Data: " + dataAtual.format(LocalDateTime.now()));
        super.imprimirExtratoGeral();
    }
}
