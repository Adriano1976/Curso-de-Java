package com.springframework.injecaodedependencia;

public class Moto implements Veiculo{

    @Override
    public void andar() {
        System.out.println("A moto está andando.");
    }
}
