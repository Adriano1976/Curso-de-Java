package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataParcela;
    private Double valorParcela;


    public Parcelas() {
    }

    public Parcelas(Date dataParcela, Double valorParcela) {
        this.dataParcela = dataParcela;
        this.valorParcela = valorParcela;
    }

    public Date getDataParcela() {
        return dataParcela;
    }

    public void setDataParcela(Date dataParcela) {
        this.dataParcela = dataParcela;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return simpleDateFormat.format(dataParcela) + " - " + String.format("R$ %.2f", valorParcela);
    }
}
