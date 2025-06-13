package com.codecraftmentor.fundamentos;

public class ServicoMensagem {
    //@Autowired
    private final Mensageiro mensageiro;

    public ServicoMensagem(Mensageiro mensageiro) {
        this.mensageiro = mensageiro;
    }

    public void notificar(String minhaMensagem) {
        mensageiro.enviar(minhaMensagem);
    }
}
