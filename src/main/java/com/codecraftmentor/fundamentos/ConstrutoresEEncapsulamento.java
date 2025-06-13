package com.codecraftmentor.fundamentos;

public class ConstrutoresEEncapsulamento {
    private String nome;
    private double preco;
    private boolean ativo;

    public ConstrutoresEEncapsulamento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.ativo = true;
    }

    public ConstrutoresEEncapsulamento(String nome, double preco, boolean ativo) {
        this.nome = nome;
        this.preco = preco;
        this.ativo = ativo;
    }

    public String getNome() { return nome; }

    public double getPreco() { return preco; }

    public void alterarPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Preço deve ser positivo");
        }
    }
}
