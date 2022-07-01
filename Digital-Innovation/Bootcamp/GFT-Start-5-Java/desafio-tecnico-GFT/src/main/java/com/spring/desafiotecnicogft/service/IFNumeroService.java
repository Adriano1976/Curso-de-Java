package main.java.com.spring.desafiotecnicogft.service;

import main.java.com.spring.desafiotecnicogft.model.Telefone;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public interface IFNumeroService {

    @GetMapping
    Telefone consultarNumero(@PathVariable("numero") String numero);


}
