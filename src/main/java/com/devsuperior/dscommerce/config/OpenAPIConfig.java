package com.devsuperior.dscommerce.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth Description",
        bearerFormat = "JWT",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        in = SecuritySchemeIn.HEADER
)
public class OpenAPIConfig {

    @Bean
    public OpenAPI dscommerceAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("DSCommerce")
                        .description("DSCommerce Reference Project")
                        .version("v0.0.1")
                        .license(new License()
                                .name("Alguma coisa 2.0")
                                .url("https://github.com/GilbertoSEspinoso/dscommerce")));
    }
}
