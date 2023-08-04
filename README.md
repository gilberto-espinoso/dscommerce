## DSCommerce

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/static/v1?style=for-the-badge&message=Apache+Maven&color=C71A36&logo=Apache+Maven&logoColor=FFFFFF&label=)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Heroku](https://img.shields.io/static/v1?style=for-the-badge&message=Heroku&color=430098&logo=Heroku&logoColor=FFFFFF&label=)

Este projeto é uma API construída usando Java, Java Spring, PostgresSQL como banco de dados e Spring Security para controle de autenticação.

A API simula a funcionalidade de um e-commerce de venda de produtos eletrônicos . Os usuários podem se registrar no aplicativo e os usuários logados podem navegar atráves de um lista ordenada de produtos, podendo adiciona-los em um pedido, usuário logado no sistema pode finalizar o pedido, caso contrário o usúario não terá permissão, enquanto os usuários ADMIN podem registrar novos produtos e conferir todos os pedidos na API.

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/GilbertoSEspinoso/dscommerce/blob/main/LICENSE)




### Índice 


- [Modelo Conceitual](#modelo-conceitual)
- [Funcionalidades](#funcionalidades)
- [Instalação](#instalação)
- [Autenticação](#autenticação)
- [Testes](#testes)
- [Aprendizado](#o-que-desenvolvi-com-esse-projeto)

## Modelo conceitual

![modelo](https://github.com/GilbertoSEspinoso/assets/blob/main/dsCommerce/modelo-conceitual.png?raw=true)

## Funcionalidades

✔️ Incluir e remover itens do pedido,  alterar as quantidades do produto em cada pedido.

✔️ Listar produtos disponíveis, podendo filtrar produtos pelo nome

✔️ Efetuar login no sistema com validação de acesso.

✔️ Salvar no sistema um pedido com a quantidade de produdos informado.


## Instalação

1. Clone the repository:

```bash
git clone https://github.com/GilbertoSEspinoso/dscommerce.git
```

2. Instalar as dependências com Maven

3. Instalar [PostgresSQL](https://www.postgresql.org/)

4. Inicie o aplicativo com o Maven

> A API está acessível em: https://dscommerce-deploy-3e590a2ab360.herokuapp.com/



## Autenticação
A API usa Spring Security para controle de autenticação. As seguintes funções estão disponíveis:

```
ROLE_CLIENT - Função de usuário padrão para usuários logados.
ROLE_ADMIN - Função de usuário administrador para gerenciar novos produtos e pedidos.
```
Para acessar endpoints protegidos como um usuário ADMIN, forneça as credenciais de autenticação apropriadas no cabeçalho da solicitação.

## Testes

Para configurar a variáveis de ambiente e adicionar as collections no Postman, faça o download dos arquivos: 

https://drive.google.com/drive/folders/1udDNOcb0iM5Shslt_AeguTQGhH_xVIkW?usp=drive_link

Dados para login:
  - maria@gmail.com ('ROLE_CLIENT')
  - alex@gmai.com ('ROLE_CLIENT' e 'ROLE_ADMIN')


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









