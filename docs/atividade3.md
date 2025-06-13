# Atividade 3 - Injeção de Dependência


### Atividade 3

> Simule um cenário com injeção de dependência sem usar o Spring.

1. Crie uma interface `Notificador` com um método `notificar(String mensagem)`.
2. Crie uma classe `EmailNotificador` que implementa a interface e imprime no console:
   "Enviando e-mail: [mensagem]".
3. Crie uma classe `ServicoDeAviso` que receba um `Notificador` no construtor e tenha um método `enviarAviso()` que utilize o notificador para enviar uma mensagem.
4. Crie uma classe principal (`main`) que instancie `EmailNotificador`, injete no `ServicoDeAviso` e chame o método `enviarAviso()`.

> Objetivo: Ao executar a classe CodeCraftMentorDevApplication o main acione ServicoDeAviso, onde a mensagem que será enviada deve ser "Enviando e-mail: [mensagem]. Olá cliente [nome], seu Pedido [numero] no valor de R$ [valor] [está/nãoestá] pago."
