/*
- Projeto Spring Boot gerado via Spring Initializr.
- Os seugintes módulos foram usados:
-- Spring Data JPA
-- Spring Web
-- H2 Database
-- OpenFeign
 */

package main.java.padroes.projetospring;

import main.java.padroes.projetospring.model.Endereco;
import main.java.padroes.projetospring.service.implementacao.ViaCEPClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner run(ViaCEPClient client){
        return args -> {
            if (args.length > 0){
                String cep = args[0];

                Endereco endereco = client.buscaEnderecoPor(cep);
                System.out.println(endereco);
            }
        };
    }

}
