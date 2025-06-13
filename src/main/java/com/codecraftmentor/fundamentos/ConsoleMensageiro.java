package com.codecraftmentor.fundamentos;

public class ConsoleMensageiro implements Mensageiro {
    public void enviar(String msg) {
        System.out.println("Mensagem: " + msg);
    }
}
