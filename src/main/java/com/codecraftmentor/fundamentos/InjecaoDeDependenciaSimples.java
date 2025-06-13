package com.codecraftmentor.fundamentos;

public class InjecaoDeDependenciaSimples {

    public static void main(String[] args) {
        Mensageiro mensageiro = new ConsoleMensageiro();
        ServicoMensagem servico = new ServicoMensagem(mensageiro);
        servico.notificar("Notifique a minha mensagem");
    }
}
