# Validação de Usuário com Chain of Responsibility

Projeto do desafio de Design Patterns da DIO.

## Descrição
API REST que valida cadastro de usuários encadeando validadores com o padrão
Chain of Responsibility.

## Padrões aplicados
- **Chain of Responsibility**: cada regra de validação é um elo da cadeia.
- **Singleton**: beans gerenciados pelo Spring (@Component).
- **Facade**: o controller esconde a cadeia por trás de POST /usuarios.
- **Strategy**: os validadores são plugáveis e podem ser reordenados.

## Tecnologias
- Java 21
- Spring Boot 3
- Maven