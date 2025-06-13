package com.codecraftmentor.fundamentos;

import java.util.List;
import java.util.Set;

public class TipagemPorObjeto {
    public static void main(String[] args) {
        Integer idade = null; // pode ser nulo
        List<Integer> numeros = List.of(1, 2, 3);
        Set<Integer> setNumber = Set.of(1,2,3);
        List<Telefone> telefones = List.of();
        System.out.println("Idade: " + idade);
        numeros.forEach(System.out::println);
    }
}
