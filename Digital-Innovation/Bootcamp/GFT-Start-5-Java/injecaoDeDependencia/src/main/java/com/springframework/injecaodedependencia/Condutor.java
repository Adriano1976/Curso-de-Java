package com.springframework.injecaodedependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Moto());
        Condutor condutor1 = new Condutor(new Carro());
        condutor.automovel();
        condutor1.automovel();
    }

    @Autowired
    private Veiculo veiculo;

    public Condutor(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void automovel() {
        veiculo.andar();
    }
}
