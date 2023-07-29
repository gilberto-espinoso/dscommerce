<h1 align="center">DScommerce</h1>

<p align='center'> 
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>  
    <img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot"/>
    <img src="https://img.shields.io/badge/JWT-F2F4F9?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=black"/>
    <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
</p>

> Status do Projeto: ✔️ (Concluído)

### Tópicos

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)

:small_blue_diamond: [Funcionalidades](#funcionalidades)

:small_blue_diamond: [Deploy da Aplicação](#layout-e-deploy-da-aplicação)

:small_blue_diamond: [Caso de uso](#casos-de-uso)

:small_blue_diamond: [Pré-requisitos](#pré-requisitos)

:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação)

:small_blue_diamond: [Tecnologias utilizadas](#tecnologias-utilizadas)

:small_blue_diamond: [Aprendizado](#o-que-desenvolvi-com-esse-projeto)

## Descrição do projeto

DSCommerce é uma aplicação back-end construída ao longo do curso `Java Spring Ultimate` da
escola de programação [DEVSUPERIOR.](https://devsuperior.com.br/cursos) 

Este projeto é baseado em um comércio eletrônico que você navega atráves de um lista 
ordenada de produtos podendo adiciona-lo ao carrinho de compras, caso o usuário esteja 
logado no sistema o seu pedido pode ser finalizado, caso contrário o usúario não realizará a 
operação. 

Essa aplicação disponibiliza três tipos de acessos: `'ROLE_ADMIN'`, `'ROLE_CLIENT'` e `público`. <br>
- `Público` pode listar todos os produtos ou realizar pesquisa pelo nome.
- `'ROLE_CLIENT'` pode incluir e remover produtos do carrinho de compra, bem como alterar as quantidades de cada item e finalizar um pedido.
- `'ROLE_ADMIN'` possui todas essas características, além de: 
  - realizar cadastro de novos produtos
  - atualizar produtos e excluir produtos.
  - visualizar pedidos pelo `id`.

## Funcionalidades

✔️ No CRUD de cada entidade(categorias, produtos e usuários) filtra itens pelo nome.

✔️ Incluir e remover itens do pedido,  alterar as quantidades do produto em cada pedido.

✔️ Listar produtos disponíveis, podendo filtrar produtos pelo nome

✔️ Efetuar login no sistema e validação de acesso.

✔️ Salvar no sistema um pedido com a quantidade de produdos informado.

## Layout e Deploy da Aplicação

>Link do deploy da API: https://dscommerce-deploy-3e590a2ab360.herokuapp.com/

### Modelo conceitual

<div style="text-align: center;">
  <img src="https://github.com/GilbertoSEspinoso/assets/blob/main/dsCommerce/modelo-conceitual.png?raw=true" alt="Descrição da imagem" style="max-width: 80%; height: auto;">
</div>

>Cada item de pedido (OrderItem) corresponde a um produto no pedido, com uma   quantidade. Sendo que o preço também é armazenado no item de pedido por  questões de histórico (se o preço do produto mudar no futuro, o preço do item de pedido continua registrado com o preço real que foi vendido na época).
>
>Um usuário pode ter um ou mais "roles", que são os perfis de acesso deste usuário no sistema (client, admin)

## Casos de Uso

### Consultar catálogo (Cenário principal de sucesso)
1. [OUT] O sistema informa uma listagem paginada de nome, imagem e preço dos
   produtos, ordenada por nome.
2. [IN] O usuário informa, opcionalmente, parte do nome de um produto
3. [OUT] O sistema informa a listagem atualizada

### Manter produtos (Cenário principal de sucesso)
1. Executar caso de uso: Consultar catálogo.
2. O admin seleciona uma das opções
   2.1. Variante Inserir
   2.2. Variante Atualizar
   2.3. Variante Deletar

### Login (Cenário principal de sucesso)
1. [IN] O usuário anônimo informa suas credenciais (nome e senha).
2. [OUT] O sistema informa um token válido.

### Gerenciar carrinho (Cenário principal de sucesso)
1. Executar caso de uso: Consultar catálogo.
2. [IN] O Usuário anônimo seleciona um produto.
3. [OUT] O sistema informa nome, preço, descrição, imagem, e nomes das categorias
   do produto selecionado.
4. [IN] O Usuário anônimo informa que deseja adicionar o produto ao carrinho.
5. [OUT] O sistema informa os dados do carrinho de compras [1].
6. [IN] O Usuário anônimo informa, opcionalmente, que deseja incrementar ou
   decrementar a quantidade de um item no carrinho de compras.
7. [ OUT] O sistema informa os dados atualizados do carrinho de compras [1].

### Registrar pedido (Cenário principal de sucesso)
1. [IN] O cliente informa os dados do carrinho de compras [1].
2. [OUT] O sistema informa os dados do carrinho de compras[1] e o id do pedido.

## Pré-requisitos

⚠️ [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

⚠️ [Postman](https://www.postman.com/)

## Como rodar a aplicação 

No terminal, clone o projeto:

```bash
git clone https://github.com/GilbertoSEspinoso/dscommerce
```
```
Use sua IDE de preferência (eu utilizei Intellij)
```
```
Faça o update das dependências do maven.
```
```
Baixar as váriaveis de ambiente e importar-las no Postman
```
```
Rodar o programa configurado no ambiente de `test`
```
>Para configurar a variáveis de ambiente e adicionar as collections no Postman, faça o download dos arquivos:
>
>
>https://drive.google.com/drive/folders/1udDNOcb0iM5Shslt_AeguTQGhH_xVIkW?usp=drive_link

- Dados para login:
  - maria@gmail.com ('ROLE_CLIENT')
  - alex@gmai.com ('ROLE_CLIENT' e 'ROLE_ADMIN')

    <p align="center">
  <img src="https://github.com/GilbertoSEspinoso/assets/blob/main/dsCommerce/name-user-vav.jpg?raw=true" alt="Descrição da imagem">
</p>

## Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- JWT, Oauth2 authentication
- Deploy with CI/CD
- Spring Security
- Database: PostgreSQL e para testes H2 Database.
- Implantação: Heroku

## O que desenvolvi com esse projeto:
- Componentes e Injeção de Dependência
- Estruturação de projeto, camadas
- Modelo de Domínio
- Relacionamentos
- Mapeamento objeto relacional
- API Rest
- Tratamento de exceções
- Validação de dados
- Consultas ao banco de dados
- Transações
- Login e controle de acesso
- OAuth2, JWT
- Variáveis de ambiente
- Perfis de projeto
- Ambiente local, homologação
- Implantação, CI/CD

<br>

[Voltar para o top](#tópicos) 🔝

<h2 align='center'> Autor </h2>
<p align='center'>Gilberto da Silva Espinoso <a href="https://www.linkedin.com/in/gilbertoespns/">LinkedIn</a> </p>









