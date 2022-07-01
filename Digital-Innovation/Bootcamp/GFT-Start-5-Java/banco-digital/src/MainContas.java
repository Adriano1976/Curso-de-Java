public class MainContas {
    public static void main(String[] args) {

        // Cadastrando o primeiro CLIENTE e realizando transações bancário.
        Cliente cliente01 = new Cliente();
        Conta contaCorrente01 = new ContaCorrente(cliente01);
        Conta contaPoupanca01 = new ContaPoupanca(cliente01);

        cliente01.setNome("Adriano");
        cliente01.setSobreNome("Santos");
        cliente01.setCpf("458.741.587-20");
        contaCorrente01.setLimite(100.00);
        contaPoupanca01.setLimite(0.00);
        contaCorrente01.depositar(100.50);
        contaCorrente01.imprimirSaldo();
        contaPoupanca01.imprimirSaldo();

        // Cliente da conta 1 Tenta realizar um saque da cc.
        try {
            contaCorrente01.sacar(1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Saldo Insuficiente!");
        } finally {
            contaCorrente01.imprimirSaldo();
        }

        // Cliente da conta 1 executa transferência de um valor da cc. Para cp.
        try {
            contaCorrente01.transferir(75, contaPoupanca01);
        } catch (IllegalArgumentException e) {
            System.out.println("Saldo Insuficiente para realizar esse procedimento!");
        } finally {
            contaCorrente01.imprimirSaldo();
            contaPoupanca01.imprimirSaldo();
        }

        // Cadastrando o segundo CLIENTE e realizando transações bancário.
        Cliente cliente02 = new Cliente();
        Conta contaCorrente02 = new ContaCorrente(cliente02);
        Conta contaPoupanca02 = new ContaPoupanca(cliente02);

        cliente02.setNome("Roberto");
        cliente02.setSobreNome("de Azevedo");
        cliente02.setCpf("654.987.258-90");
        contaCorrente02.setLimite(100.00);
        contaPoupanca02.setLimite(0.00);
        contaCorrente02.depositar(100.50);
        contaCorrente02.imprimirSaldo();
        contaPoupanca02.imprimirSaldo();


        // Cliente da conta 2 executa transference de um valor da cc. Para cp.
        try {
            contaCorrente02.transferir(50, contaPoupanca01);
        } catch (IllegalArgumentException e) {
            System.out.println("Trasnferência Cancelada.\nSaldo Insuficiênte.");
        } finally {
            contaCorrente02.imprimirSaldo();
        }

        // Cliente da conta 1 Tenta realizar um saque da cc.
        try {
            contaCorrente02.sacar(500);
        } catch (IllegalArgumentException e) {
            System.out.println("Saldo Insuficiente!");
        } finally {
            contaCorrente02.imprimirSaldo();
        }

        // Cliente da conta 1 executa transferência de um valor da cc. Para o cliente da conta 2 na cc.
        try {
            contaCorrente01.transferir(25, contaCorrente02);
        } catch (IllegalArgumentException e) {
            System.out.println("Trasnferência Cancelada.\nSaldo Insuficiênte.");
        } finally {
            contaCorrente01.imprimirSaldo();
        }

        // Cliente da conta 1 realiza um depósito na sua cc.
        contaCorrente01.depositar(350);
        contaCorrente01.imprimirSaldo();

        // Cliente da conta 2 realiza um depósito na sua cc.
        contaCorrente02.depositar(1550);
        contaCorrente02.imprimirSaldo();


        // Cliente da conta 1 executa transferência de um valor da cc. Para o cliente da conta 2 na cc.
        try {
            contaCorrente01.transferir(85, contaCorrente02);
        } catch (IllegalArgumentException e) {
            System.out.println("Trasnferência Cancelada.\nSaldo Insuficiênte.");
        } finally {
            contaCorrente01.imprimirSaldo();
        }

        // Cliente da conta 1 executa transferência de um valor da cc. Para a sua cp.
        try {
            contaCorrente01.transferir(100, contaPoupanca01);
        } catch (IllegalArgumentException e) {
            System.out.println("Trasnferência Cancelada.\nSaldo Insuficiênte.");
        } finally {
            contaCorrente01.imprimirSaldo();
            contaPoupanca01.imprimirSaldo();
        }

        // Cliente da conta 2 executa transferência de um valor da cc. Para a sua cp.
        try {
            contaCorrente02.transferir(2500, contaPoupanca02);
        } catch (IllegalArgumentException e) {
            System.out.println("Trasnferência Cancelada.\nSaldo Insuficiênte.");
        } finally {
            contaCorrente02.imprimirSaldo();
            contaCorrente02.imprimirSaldo();
        }

        // Extrado dos CLIENTES: Conta Corrente | Conta Poupança
        contaCorrente01.imprimirExtrato();
        contaPoupanca01.imprimirExtrato();
        contaCorrente02.imprimirExtrato();
        contaPoupanca02.imprimirExtrato();

    }
}
