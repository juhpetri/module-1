package com.codecraftmentor.fundamentos;

interface Mensageiro {
    void enviar(String msg);
}

class ConsoleMensageiro implements Mensageiro {
    public void enviar(String msg) {
        System.out.println("Mensagem: " + msg);
    }
}

class ServicoMensagem {
    private Mensageiro mensageiro;

    public ServicoMensagem(Mensageiro mensageiro) {
        this.mensageiro = mensageiro;
    }

    public void notificar() {
        mensageiro.enviar("Você tem uma nova notificação.");
    }
}

public class InjecaoDeDependenciaSimples {
    public static void main(String[] args) {
        Mensageiro mensageiro = new ConsoleMensageiro();
        ServicoMensagem servico = new ServicoMensagem(mensageiro);
        servico.notificar();
    }
}