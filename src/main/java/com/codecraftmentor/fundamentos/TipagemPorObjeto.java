package com.codecraftmentor.fundamentos;

import java.util.List;

public class TipagemPorObjeto {
    public static void main(String[] args) {
        Integer idade = null; // pode ser nulo
        List<Integer> numeros = List.of(1, 2, 3); // uso em coleções
        System.out.println("Idade: " + idade);
        numeros.forEach(System.out::println);
    }
}