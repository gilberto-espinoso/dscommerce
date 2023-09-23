package com.devsuperior.dscommerce;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "DScommerce - Produtos Eletrônicos", version = "1.0", description =
        "O sistema apresenta um catálogo de produtos, os quais podem ser filtrados pelo nome do produto. " +
                "A partir desse catálogo, o usuário pode selecionar um produto para ver seus detalhes e decidir " +
                "adicionar-lo no pedido. O usuário pode incluir, remover ou alterar a quantidade de cada pedido. " +
                "Uma vez que o usuário decida encerrar o pedido, o mesmo será salvo com status de \"aguardando pagamento\". " +
                "Os status dos pedidos são: aguardando pagamento, pago, enviado, entregue e cancelado. Os usuários do sistema " +
                "podem ser clientes ou administradores, sendo que todo usuário cadastrado por padrão é cliente. Usuários não " +
                "identificados podem se cadastrar no sistema, navegar entre produtos e pedidos. " +
                "Clientes podem atualizar seu cadastro, registrar pedidos e visualizar seu pedido. Usuários administradores " +
                "tem acesso aos usuários cadastrados, produtos, categorias e pedidos."))
//<-- anotação do Swagger exemplo
public class DscommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DscommerceApplication.class, args);
    }

}
