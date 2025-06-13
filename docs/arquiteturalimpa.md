# 🧱 Arquitetura Limpa – Estrutura do Projeto

Este projeto segue os princípios da **Clean Architecture**, promovendo um código desacoplado, testável e com responsabilidades bem definidas.

---

## 📐 Visão Geral da Arquitetura

Use este esquema para visualizar a organização em pacotes:

    com.codecraftmentor.modulo2
    ├── domain
    │   ├── model               ← Entidades de domínio (ex: Cliente, Pedido)
    │   └── usecase             ← Interfaces (ports) dos casos de uso
    ├── application
    │   └── service             ← Implementação dos casos de uso (application service)
    ├── interfaceadapter
    │   ├── controller          ← APIs REST (camada de entrada)
    │   └── dto                 ← Objetos de entrada/saída (Request/Response)
    ├── infrastructure
    │   ├── repository          ← Acesso a dados (ex: JPA, memória, etc)
    │   └── config              ← Configurações Spring (beans, properties)
    └── Application.java        ← Ponto de entrada da aplicação (Spring Boot)

---

## 🧩 Descrição das Camadas

### `domain.model`

Contém as entidades do domínio puro.  
Sem dependência de frameworks ou infraestrutura.

**Exemplo:**
```java
public class Cliente {
    private String nome;
    private String email;
    private boolean ativo;
}
```
### `domain.usecase`
Interfaces (ports) que representam os casos de uso da aplicação.

**Exemplo:**
```java
public interface ClienteService {
void cadastrar(Cliente cliente);
}
```


### `application.service`

Implementações dos casos de uso definidos na camada usecase.
Aqui fica a lógica de negócio e orquestração de serviços e repositórios.

**Exemplo:**
```java
@Service
public class ClienteServiceImpl implements ClienteService {
private final ClienteRepositoryImpl repository;

    public ClienteServiceImpl(ClienteRepositoryImpl repository) {
        this.repository = repository;
    }

    public void cadastrar(Cliente cliente) {
        repository.salvar(cliente);
    }
}
```

### `interfaceadapter.controller`

Controladores REST que recebem requisições externas e chamam os serviços da aplicação.

**Exemplo:**
```java
@RestController
@RequestMapping("/clientes")
public class ClienteController {
private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public String cadastrar(@RequestBody ClienteRequest request) {
        Cliente cliente = new Cliente(request.getNome(), request.getEmail(), request.isAtivo());
        clienteService.cadastrar(cliente);
        return "Cliente cadastrado com sucesso!";
    }
}
```

### `interfaceadapter.dto`

Objetos usados para comunicação entre o mundo externo (API) e o domínio.
Exemplo: ClienteRequest, ClienteResponse.


### `infrastructure.repository`

Contém os mecanismos de persistência de dados e implementações concretas (como JPA, Mongo, ou em memória).

**Exemplo:**
```java
@Repository
public class ClienteRepositoryImpl {
private List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }
}
```

### `infrastructure.config`

Configurações globais do projeto, beans, mapeamentos manuais, etc.

Application.java
Classe principal responsável por iniciar a aplicação Spring Boot.

**Exemplo:**
```java
@SpringBootApplication
public class Application {
public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    }
}
```
---
### ✅ Benefícios da Arquitetura Limpa
- **Separação de preocupações**: Cada camada tem uma responsabilidade clara.
- **Baixo acoplamento**: Facilita a manutenção e evolução do sistema.
- **Testabilidade**: Camadas independentes permitem testes unitários e integração mais fáceis.
- **Flexibilidade**: Mudanças em uma camada não afetam as demais, permitindo evolução sem quebrar o sistema.
- **Organização clara**: Facilita a navegação e compreensão do código.
- **Independência de frameworks**: O domínio não depende de bibliotecas externas, permitindo fácil migração ou substituição de tecnologias.

