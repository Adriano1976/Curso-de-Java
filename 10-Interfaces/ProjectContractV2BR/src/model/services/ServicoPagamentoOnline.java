package model.services;

public interface ServicoPagamentoOnline {

    double taxaPagamento(double valor);

    double taxaMensal(double valor, int meses);
}
