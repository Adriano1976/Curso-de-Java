package model.services;

public class ServicoPayPal implements ServicoPagamentoOnline {

    private static final double TAXA_PAGAMENTO = 0.02;
    private static final double TAXA_MENSAL = 0.01;

    @Override
    public double taxaPagamento(double valor) {
        return valor * TAXA_PAGAMENTO;
    }

    @Override
    public double taxaMensal(double valor, int meses) {
        return valor * TAXA_MENSAL * meses;
    }
}
