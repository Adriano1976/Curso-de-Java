package main.java.padroes.projetospring.service;

/*
- Interface que define o padrão <b>Strategy</b> no domínio de cliente.
Com isso, se necessário, podemos ter multiplas implementações dessa mesma interface.
 */

import main.java.padroes.projetospring.model.Cliente;

public interface IFClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
