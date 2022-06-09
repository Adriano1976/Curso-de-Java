/*
- Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser injetada pelo
Spring (via {@link autowired}). Com isso, como essa classe é um {@link Service}, ela será
tratada como um <b>Singleton</b>.

APPLICATION FAILED TO START:
## Description:
- Field numeroService in com.spring.desafiotecnicogft.service.implementacao.ClienteService
required a bean of type 'com.spring.desafiotecnicogft.service.IFNumeroService' that could not be found.
## The injection point has the following annotations:
- @org.springframework.beans.factory.annotation.Autowired(required=true)
## Action:
- Consider defining a bean of type 'com.spring.desafiotecnicogft.service.IFNumeroService' in your configuration.
 */

package com.spring.desafiotecnicogft.service.implementacao;

import com.spring.desafiotecnicogft.model.*;
import com.spring.desafiotecnicogft.service.IFClienteService;
import com.spring.desafiotecnicogft.service.IFNumeroService;
import com.spring.desafiotecnicogft.service.IFViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Component
public class ClienteService implements IFClienteService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private IFClienteRepository clienteRepository;
    @Autowired
    private IFEnderecoRepository enderecoRepository;
    @Autowired
    private IFTelefoneRepository telefoneRepository;
    @Autowired
    private IFViaCepService viaCepService;
    @Autowired
    private IFNumeroService numeroService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
    @Override
    public Iterable<Cliente> buscarTodos() {
        // Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // Buscar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        // Salvar Cliente com CEP
        salvarClienteComCep(cliente);
        salvarClienteComTelefone(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Buscar Cliente por ID, caso exista:
        Optional<Cliente> clienteById = clienteRepository.findById(id);
        if (clienteById.isPresent()) {
            salvarClienteComCep(cliente);
            salvarClienteComTelefone(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        // Verificar se o Endereco do Cliente já existe, pelo CEP.
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco, novo ou existente
        clienteRepository.save(cliente);
    }

    private void salvarClienteComTelefone(Cliente cliente) {

        String numero = cliente.getTelefone().getNumero();
        Telefone telefone = telefoneRepository.findById(numero).orElseGet(() -> {
            Telefone novoNumero = numeroService.consultarNumero(numero);
            telefoneRepository.save(novoNumero);
            return novoNumero;
        });

        cliente.setTelefone(telefone);
        telefoneRepository.save(telefone);
    }


}
