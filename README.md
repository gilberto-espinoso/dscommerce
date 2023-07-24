<h1 align="center">DSCommerce</h1>

<p align='center'> 
    <img src="https://img.shields.io/badge/Spring_Boot  V3.1.3-F2F4F9?style=for-the-badge&logo=spring-boot"/>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>  
    <img src="https://img.shields.io/badge/JWT-F2F4F9?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=black"/>
    <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
</p>

# Sobre o projeto

DSCommerce é um aplicativo de comércio eletrônico realizado como projeto final do bootcamp Java Spring Ultimate da escola de programação DEVSUPERIOR.

Nesse projeto teremos partes que apenas administradores poderão acessar, validar e 
assim por diante. Esse projeto é um exemplo de habilidades que venho praticando diariamente e assim que possível, receberá novas 
atualizações e servirá para fazer alguns testes e manter o conhecimento em dia. Mesmo sendo um projeto backend, em breve vou 
integrá-lo com o frontend, transformando-o em um aplicativo fullstack.


## Tecnologias utilizadas para a construção do projeto
### Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- JWT, Oauth2 authentication
- Deploy with CI/CD
- Spring Security
- Database: PostgreSQL e para testes H2 Database.


## Como executar o projeto:

- Pré-requisitos: Java versão 17 ou superior
- Clone o repositório
```bash
git clone https://github.com/GilbertoSEspinoso/dscommerce.git
```
- Use sua IDE de preferência (eu utilizei Intellij)
- Faça o update das dependências do maven.

<br>
<br>

>Para configurar a variáveis de ambiente e adicionar as collections no Postman, faça o download dos arquivos: 
> 
> 
>https://drive.google.com/drive/folders/1udDNOcb0iM5Shslt_AeguTQGhH_xVIkW?usp=drive_link





  - Dados para login: 
    - maria@gmail.com ('ROLE_CLIENT') 
    - alex@gmai.com ('ROLE_CLIENT' e 'ROLE_ADMIN')
    - ![colletion2](https://github.com/GilbertoSEspinoso/assets/blob/main/dsCommerce/name-user-vav.jpg?raw=true)



<br>

<h1>Modelo conceitual</h1>

- Cada item de pedido (OrderItem) corresponde a um produto no pedido, com uma
  quantidade. Sendo que o preço também é armazenado no item de pedido por
  questões de histórico (se o preço do produto mudar no futuro, o preço do item de
  pedido continua registrado com o preço real que foi vendido na época).


- Um usuário pode ter um ou mais "roles", que são os perfis de acesso deste usuário
  no sistema (client, admin)
<br>
<br>
  
![UML](https://github.com/GilbertoSEspinoso/assets/blob/main/dsCommerce/modelo-conceitual.png?raw=true)
<br>
<br>

| Caso de uso | Visão geral                                                                                    | Acesso |
|----------|------------------------------------------------------------------------------------------------|----------------|
| Manter produtos | CRUD de produtos, podendo filtrar itens pelo nome                                              | Somente Admin |
| Manter categorias  | CRUD de categorias, podendo filtrar itens pelo nome                                            | Somente Admin |
| Manter usuários  | CRUD de usuários, podendo filtrar itens pelo nome                                              | Somente Admin |
| Gerenciar carrinho  | Incluir e remover itens do carrinho de compras, alterar as quantidades do produto em cada item | Público |
| Consultar catálogo  | Listar produtos disponíveis, podendo filtrar produtos pelo nome                                | Público |
| Sign up  | Cadastrar-se no sistema                                                                        | Público |
| Login  | Efetuar login no sistema                                                                       | Público |
| Registrar pedido  | Salvar no sistema um pedido a partir dos dados do carrinho de compras informado                | Usuário Logado |
| Atualizar perfil  | Atualizar o próprio cadastro                                                                   | Usuário Logado |
| Visualizar pedidos | Visualizar os pedidos que o próprio usuário já fez                                             | Usuário Logado |
| Registrar pagamento | Salvar no sistema os dados do pagamento de um pedido                                           | Somente Admin |
| Reportar pedidos | Relatório de pedidos, podendo ser filtrados por data                                           | Somente Admin |





## Autor

<h4> Gilberto S Espinoso / DEVSUPERIOR </h4>

LinkedIn https://www.linkedin.com/in/gilbertoespns/
