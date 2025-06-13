package com.codecraftmentor.fundamentos;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        // Estrutura de repetição for
        String[] frutas = {"Maçã", "Banana", "Laranja"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Contando: " + i + " - Fruta: " + frutas[i]);
        }

        // Estrutura de repetição for-each
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
        // Estrutura de repetição do-while
        int k = 0;
        do {
            System.out.println("Do-While: " + k);
            k++;
        } while (k < 3);

        // Estrutura de repetição while
        int j = 0;
        while (j < 3) {
            System.out.println("While: " + j);
            j++;
        }
    }
}
