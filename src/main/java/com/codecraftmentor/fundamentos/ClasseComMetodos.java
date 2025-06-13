package com.codecraftmentor.fundamentos;

public class ClasseComMetodos {
    private String nome;
    private int idade;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
}
