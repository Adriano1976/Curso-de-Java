/*
- Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do <b>ViaCEP</b>.
 */

package main.java.com.spring.desafiotecnicogft.service;

import main.java.com.spring.desafiotecnicogft.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface IFViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
