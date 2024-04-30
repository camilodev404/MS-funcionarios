package com.funcionarios.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * http://localhost:8082/swagger-ui/
 */

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "SAFORTI MS-Funcionarios",
                version = "1.0",
                description = "Miscroservicio para la gestion de funcionarios",
                license = @License(name = "Universidad Distrital", url = "https://facingenieria.udistrital.edu.co/espingsoftware/index.php/"),
                contact = @Contact(
                        name = "Camilo Niño && Alejandra Castillo",
                        email = "ccninor@udistrital.edu.co"
                )
        )
)
public class SwaggerConfig {


}
