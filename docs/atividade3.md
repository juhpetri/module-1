# Atividade 3 - Injeção de Dependência


### Atividade 3

> Simule um cenário com injeção de dependência sem usar o Spring.

1. Crie uma interface `Notificador` com um método `notificar(String mensagem)`.
2. Crie uma classe `EmailNotificador` que implementa a interface e imprime no console:
   "Enviando e-mail: [mensagem]".
3. Crie uma classe `ServicoDeAviso` que receba um `Notificador` no construtor e tenha um método `enviarAviso()` que utilize o notificador para enviar uma mensagem.
4. Crie uma classe principal (`main`) que instancie `EmailNotificador`, injete no `ServicoDeAviso` e chame o método `enviarAviso()`.

> Objetivo: Demonstrar como a dependência (`Notificador`) pode ser injetada no serviço, permitindo a troca fácil de implementações e promovendo baixo acoplamento.
