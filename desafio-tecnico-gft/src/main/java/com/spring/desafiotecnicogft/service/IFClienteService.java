/*
- Interface que define o padrão <b>Strategy</b> no domínio de cliente.
Com isso, se necessário, podemos ter multiplas implementações dessa mesma interface.
 */

package com.spring.desafiotecnicogft.service;

import com.spring.desafiotecnicogft.model.Cliente;

public interface IFClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
