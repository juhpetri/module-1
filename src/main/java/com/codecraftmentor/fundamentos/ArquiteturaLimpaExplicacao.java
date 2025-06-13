package com.codecraftmentor.fundamentos;

/**
 * ArquiteturaLimpaExplicacao
 *
 * Esta classe serve como documentação viva da arquitetura do projeto,
 * baseada nos princípios da Clean Architecture.
 *
 * As camadas estão separadas de forma a promover:
 * - Baixo acoplamento
 * - Alta coesão
 * - Independência de frameworks
 * - Facilidade de testes e manutenção
 */
public class ArquiteturaLimpaExplicacao {

    /*
     * ──────────────────────────────
     * DOMAIN
     * ──────────────────────────────
     * Camada central da aplicação, onde residem as regras de negócio mais puras.
     *
     * Pacote: com.code.craft.mentor.dev.domain.model
     * Responsabilidade: Representar as entidades do domínio (ex: Cliente, Pedido).
     * - Não deve ter dependências com outras camadas
     *
     * Pacote: com.code.craft.mentor.dev.domain.usecase
     * Responsabilidade: Interfaces (ports) que descrevem os casos de uso.
     * - Ex: interface ClienteService com método cadastrar(Cliente c)
     */

    /*
     * ──────────────────────────────
     * APPLICATION
     * ──────────────────────────────
     * Camada que implementa os casos de uso definidos no domínio.
     *
     * Pacote: com.code.craft.mentor.dev.application.service
     * Responsabilidade: Implementar as interfaces da camada de domínio.
     * - Ex: ClienteServiceImpl implementa ClienteService
     * - Contém a lógica de orquestração, validação e aplicação das regras
     */

    /*
     * ──────────────────────────────
     * INTERFACE ADAPTERS/APPLICATION
     * ──────────────────────────────
     * Camada de entrada e saída (adapters) da aplicação.
     *
     * Pacote: com.code.craft.mentor.dev.interfaceadapter.controller
     * Responsabilidade: Controladores REST que recebem requisições externas
     * - Ex: ClienteController mapeia endpoints como /clientes
     *
     * Pacote: com.code.craft.mentor.dev.interfaceadapter.dto
     * Responsabilidade: Objetos de transporte (DTOs)
     * - Recebem e devolvem dados da API de forma desacoplada do modelo de domínio
     */

    /*
     * ──────────────────────────────
     * INFRASTRUCTURE
     * ──────────────────────────────
     * Camada mais externa, lidando com frameworks, bancos e detalhes técnicos.
     *
     * Pacote: com.code.craft.mentor.dev.infrastructure.repository
     * Responsabilidade: Implementar acesso a dados (JPA, Mongo, memória, etc.)
     * - Ex: ClienteRepositoryImpl simula persistência
     *
     * Pacote: com.code.craft.mentor.dev.infrastructure.config
     * Responsabilidade: Beans e configurações específicas do Spring Boot
     * - Ex: mapeamento manual de beans, propriedades
     */

    /*
     * ──────────────────────────────
     * ROOT / ENTRY POINT
     * ──────────────────────────────
     * Pacote: com.code.craft.mentor.dev
     * Responsabilidade: Ponto de entrada da aplicação com a classe Application
     * - Inicializa o contexto Spring Boot
     */
}
