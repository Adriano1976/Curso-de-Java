package com.springframework.injecaodedependencia;

public class Carro implements Veiculo{

    @Override
    public void andar() {
        System.out.println("O carro está andando.");
    }
}
