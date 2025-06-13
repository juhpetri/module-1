package com.codecraftmentor.fundamentos;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        // Estrutura de repetição for
        for (int i = 0; i < 5; i++) {
            System.out.println("Contando: " + i);
        }

        // Estrutura de repetição for-each
        String[] frutas = {"Maçã", "Banana", "Laranja"};
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