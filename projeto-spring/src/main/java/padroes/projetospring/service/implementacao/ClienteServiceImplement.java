/*
- Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser injetada pelo
Spring (via {@link autowired}). Com isso, como essa classe é um {@link Service}, ela será
tratada como um <b>Singleton</b>.
 */

package main.java.padroes.projetospring.service.implementacao;

import main.java.padroes.projetospring.model.Cliente;
import main.java.padroes.projetospring.model.Endereco;
import main.java.padroes.projetospring.model.IFClienteRepository;
import main.java.padroes.projetospring.model.IFEnderecoRepository;
import main.java.padroes.projetospring.service.IFClienteService;
import main.java.padroes.projetospring.service.IFViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImplement implements IFClienteService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private IFClienteRepository clienteRepository;
    @Autowired
    private IFEnderecoRepository enderecoRepository;
    @Autowired
    private IFViaCepService viaCepService;

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
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Buscar Cliente por ID, caso exista:
        Optional<Cliente> clienteById = clienteRepository.findById(id);
        if (clienteById.isPresent()) {
            salvarClienteComCep(cliente);
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
}
