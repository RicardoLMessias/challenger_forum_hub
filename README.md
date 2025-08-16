# ForumHub

Um projeto desenvolvido como desafio da **Alura**, que implementa um sistema de fórum utilizando **Spring Boot**, com autenticação via **Spring Security (JWT)** e persistência de dados em **MySQL**.

---

##  Funcionalidades

- Cadastro e autenticação de usuários (**JWT**)
- Cadastro, listagem e gerenciamento de tópicos
- Associação de tópicos a cursos e usuários
- Controle de acesso seguro via **Spring Security**
- Persistência em banco relacional com **JPA/Hibernate**

---

## ⚙ Tecnologias Utilizadas

- **Java 24**
- **Spring Boot** (Web, Security, Data JPA)
- **MySQL**
- **Flyway** (controle de migrations)
- **Lombok** (redução de boilerplate)

---

##  Como Rodar o Projeto

### Pré-requisitos

- Java 24
- Maven
- MySQL

### Passos

1. Clone o repositório:
   git clone https://github.com/RicardoLMessias/challenger_forum_hub
   cd forumhub
   ---
   
Configure o banco de dados no arquivo application.properties:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/forumhub
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
Execute o projeto com Maven:
---

mvn spring-boot:run
Acesse a aplicação em:


http://localhost:8080
---
##  Estrutura do Projeto

src/

 ├── main/
 
 │   ├── java/br/com/alura/Challenger/Forumhub
 
 │   │    ├── controller     # Endpoints REST
 
 │   │    ├── domain         # Entidades e regras de negócio
 
 │   │    ├── repository     # Interfaces JPA
 
 │   │    └── security       # Configuração de segurança
 
 │   └── resources/
 
 │        ├── application.properties
 
 │        └── db/migration   # Migrations Flyway

 
---
##Autenticação
A API utiliza JWT (JSON Web Token) para autenticação.

Endpoint público:

POST /login → Gera token de autenticação

Endpoints privados exigem token JWT no header:


Authorization: Bearer <token>
---
##Endpoints Principais
Tópicos
GET /topicos → Lista todos os tópicos

GET /topicos/{id} → Detalha um tópico específico

POST /topicos → Cria um novo tópico

PUT /topicos/{id} → Edita um tópico existente

DELETE /topicos/{id} → Exclusão lógica de um tópico

✨ Melhorias Futuras
Documentação da API com Swagger/OpenAPI

Testes unitários e de integração

Implementação de roles e permissões avançadas
