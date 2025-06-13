package com.codecraftmentor.fundamentos;

public class InjecaoDeDependenciaSpring {

    //@Autowired está sem a dependencia do Spring
    private static final ServicoMensagem servicoMensagem = new ServicoMensagem(new ConsoleMensageiro());

    public static void main(String[] args) {
        servicoMensagem.notificar("Notifique a minha mensagem");
    }


}
