package model.services;

import model.entities.Contrato;
import model.entities.Parcelas;

import java.util.Calendar;
import java.util.Date;

public record ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {

    public void processandoContrato(Contrato contrato, int mes) {

        double ParcelaBase = contrato.getValorContrato() / mes;

        Calendar calendar = Calendar.getInstance();
        Date dataContrato = contrato.getDataContrato();
        calendar.setTime(dataContrato);

        for (int i = 1; i <= mes; i++) {
            calendar.add(Calendar.MONTH, i);
            dataContrato = calendar.getTime();

            Date dataPrestacao = dataContrato;
            double ParcelaTaxaMensal = ParcelaBase + servicoPagamentoOnline.taxaMensal(ParcelaBase, i);
            double ParcelaTaxaPagamento = ParcelaTaxaMensal + servicoPagamentoOnline.taxaPagamento(ParcelaTaxaMensal);
            contrato.addParcela(new Parcelas(dataPrestacao, ParcelaTaxaPagamento));
        }
    }
}
