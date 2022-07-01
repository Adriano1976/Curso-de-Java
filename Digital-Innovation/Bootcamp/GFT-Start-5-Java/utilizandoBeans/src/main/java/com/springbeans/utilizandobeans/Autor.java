package com.springbeans.utilizandobeans;

public class Autor implements AutorLivro {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirAutor() {
        System.out.println(this.nome);
    }
}
