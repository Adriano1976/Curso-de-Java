/*
- Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do <b>ViaCEP</b>.
- @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
- @see <a href="https://viacep.com.br">ViaCEP</a>
 */

package main.java.padroes.projetospring.service;

import main.java.padroes.projetospring.model.Endereco;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface IFViaCepService {
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
