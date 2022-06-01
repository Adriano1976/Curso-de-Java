package com.spring.desafiotecnicogft.service;

import com.spring.desafiotecnicogft.model.Telefone;
import org.springframework.stereotype.Component;

@Component
public interface IFTelefoneService {

    Iterable<Telefone> buscarTodos();

    Telefone buscarPorId(Long id);

    void inserir(Telefone telefone);

    void atualizar(Long id, Telefone telefone);

    void deletar(Long Id);
}
