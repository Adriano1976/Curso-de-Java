package com.example.utilizandobeans;

public class Livro {

    private String nome;
    private String codigo;

    public Livro() {
    }

    public Livro(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibir(){
        System.out.println(this.nome + " - " + this.codigo);
    }
}
