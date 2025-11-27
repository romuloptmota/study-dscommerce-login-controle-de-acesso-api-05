# Study • Login e Controle de Acesso - API
Adicionado login e controle de acesso a um sistema desenvolvido anteriormente.

## 🚀 Tecnologias Utilizadas
- Java 21
- Spring Boot
- Maven
- JPA / Hibernate
- H2 Database
- OAuth2 / JWT (password grant)
- Spring Security

## 🎯 Objetivo do Projeto
Este projeto foi desenvolvido com foco em estudos, praticando os principais conceitos do Spring Boot e autenticação utilizando OAuth2, JWT e o fluxo password grant.

Funcionalidades implementadas:

- Login via OAuth2
- Geração de token JWT
- Controle de acesso por rota
- Proteção de endpoints por perfil


## 📁 Estrutura do Projeto

```
src/
└── main/
  └── java/
  | └── com.devsuperior.dscommerce/
  |   └── config/
  |      └── customgrant
  |         └── CustomPasswordAuthenticationConverter.java
  |         └── CustomPasswordAuthenticationProvider.java
  |         └── CustomPasswordAuthenticationToken.java
  |         └── CustomUserAuthorities.java
  |      └── AuthorizationServerConfig.java
  |      └── ResourceServerConfig.java
  |
  |   └── controller/
  |      └── handlers/
  |
  |   └── dto/
  |   └── entities/
  |   └── projections/
  |   └── repository/
  |   └── service/
  |      └── exceptions/
  |   └── DscommerceApplication.java
  |
  └── resources/
      └── application.properties
      └── application-test.properties
      └── import.sql
```

## ⚙️ Como Executar

1. Clonar o repositório 
```
git clone https://github.com/romuloptmota/study-dscommerce-login-controle-de-acesso-api-05
```
2. Abra o projeto em sua IDE favorita (IntelliJ recomendado)
3. Execute a aplicação pela classe:
```
DscommerceApplication.java
```
4. Faça as requisições usando:
   
   - Postman
   - Insomnia
   - ThunderClient (VS Code)

O banco H2 é carregado automaticamente e um script import.sql popula os dados iniciais.

## 📌 Endpoints Principais

### 🔐 Autenticação
```
POST /oauth2/token
```
### 🛒 Orders
```
GET  /orders/{id}
POST /orders
```
### 📦 Products
```
GET  /products/{id}
GET  /products?size=12&page=0&sort=name,desc&name=pc%20gamer
POST /products
PUT  /products/{id}
DEL  /products/{id}
```
### 👤 Usuário
```
GET  /users/me
```
### 🏷️ Categorias
```
GET  /categories
```

## 📄 Licença
Este projeto é apenas para fins de estudo e não possui fins comerciais.








