package main.java.com.spring.desafiotecnicogft.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFClienteRepository extends CrudRepository<Cliente, Long> {

}