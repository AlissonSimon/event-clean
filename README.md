# Event Clean

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Docker](https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)

Este repositório contém o Event Clean, uma aplicação desenvolvida do zero utilizando os conceitos de Clean Architecture e seguindo as boas práticas dos princípios do SOLID para garantir um software desacoplado, testável e de fácil manutenção.

## Tecnologias e Arquitetura

* **Java & Spring Boot** (Web, Data JPA).
* **PostgreSQL** configurado como banco de dados principal.
* **Lombok** para redução de código boilerplate.
* **Docker** para containerização e facilidade de setup inicial.

## Estrutura do Projeto

```
event-clean/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/alissonsimon/event_clean/
│   │   │       ├── core/
│   │   │       │   ├── domain/...
│   │   │       │   ├── enums/...
│   │   │       │   ├── exception/...
│   │   │       │   ├── gateway/...
│   │   │       │   ├── useCases/...
│   │   │       ├── infra/
│   │   │       │   ├── beans/...
│   │   │       │   ├── controller/...
│   │   │       │   ├── dto/...
│   │   │       │   ├── exception/...
│   │   │       │   ├── gateway/...
│   │   │       │   ├── mapper/...
│   │   │       │   ├── persistence/...
│   │   │       └── EventCleanApplication.java
│   │   ├── resources/
│   │       ├── db/migration/...
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.yml
│   ├── test/
│       ├── java/
│           ├── com/alissonsimon/event_clean/
│               ├── EventCleanApplicationTests
├── README.md
├── docker-compose.yml
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Como Executar

O projeto está containerizado para facilitar o setup inicial.

1. Clone o repositório: `git clone https://github.com/AlissonSimon/event-clean.git`
2. Na raiz do projeto, execute: `docker-compose up -d`
3. A API estará disponível em `http://localhost:8080`
