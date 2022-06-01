package com.spring.desafiotecnicogft.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFEnderecoRepository extends CrudRepository<Endereco, String> {

}
