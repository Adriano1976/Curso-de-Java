/*
- Projeto Spring Boot gerado via Spring Initializr.
- Os seguintes módulos foram selecionados:
    - Spring Data JPA
    - Spring Web
    - H2 Database
    - OpenFeign
 */

package main.java.com.spring.desafiotecnicogft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioTecnicoGftApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesafioTecnicoGftApplication.class, args);

    }
}
