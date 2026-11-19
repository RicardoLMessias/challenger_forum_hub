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

```bash
git clone https://github.com/RicardoLMessias/challenger_forum_hub.git
cd challenger_forum_hub
```

2. Crie o banco `forumhub` no MySQL e defina as variáveis de ambiente usadas no `application.properties`:

```bash
export DB_NAMEURL=jdbc:mysql://localhost:3306/forumhub
export DB_USER=seu-usuario
export DB_PASSWORD=sua-senha
export JWT_SECRET=uma-chave-secreta
```

3. Execute o projeto (as tabelas são criadas pelas migrations do Flyway):

```bash
./mvnw spring-boot:run
```

A API sobe em `http://localhost:8080`.

---

## Estrutura do Projeto

```
src/main/
├── java/br/com/alura/Challenger/Forumhub/
│   ├── controller/        # Endpoints REST
│   ├── domain/
│   │   ├── topico/        # Entidade, DTOs e repositório de tópicos
│   │   └── usuario/       # Entidade, repositório e serviço de autenticação
│   └── infra/
│       ├── exception/     # Tratamento global de erros
│       └── security/      # Spring Security e filtro JWT
└── resources/
    ├── application.properties
    └── db/migration/      # Migrations Flyway (V1 a V6)
```

---

## Autenticação

A API utiliza JWT (JSON Web Token). Faça login para receber o token:

```
POST /login
```

As demais rotas exigem o token no header:

```
Authorization: Bearer <token>
```

---

## Endpoints Principais

| Método | Rota | Descrição |
|---|---|---|
| POST | `/login` | Autentica e retorna o token JWT |
| GET | `/topicos` | Lista os tópicos |
| GET | `/topicos/{id}` | Detalha um tópico |
| POST | `/topicos` | Cria um tópico |
| PUT | `/topicos` | Atualiza um tópico |
| DELETE | `/topicos/{id}` | Exclusão lógica de um tópico |

---

## Melhorias Futuras

- Documentação da API com Swagger/OpenAPI
- Testes unitários e de integração
- Roles e permissões avançadas

## Autor

Ricardo Lima Messias — [GitHub](https://github.com/RicardoLMessias) · [LinkedIn](https://www.linkedin.com/in/ricardolimamessias-java)
