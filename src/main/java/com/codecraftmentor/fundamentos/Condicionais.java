package com.codecraftmentor.fundamentos;

public class Condicionais {
    public static void main(String[] args) {
        // Exemplo de if-else
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Exemplo de switch
        String dia = "segunda";
        switch (dia) {
            case "segunda":
                System.out.println("Hoje é segunda-feira");
                break;
            case "terça":
                System.out.println("Hoje é terça-feira");
                break;
            case "quarta":
                System.out.println("Hoje é quarta-feira");
                break;
            case "quinta":
                System.out.println("Hoje é quinta-feira");
                break;
            case "sexta":
                System.out.println("Hoje é sexta-feira");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Exemplo de operador ternário
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número " + numero + " é " + resultado);

    }
}