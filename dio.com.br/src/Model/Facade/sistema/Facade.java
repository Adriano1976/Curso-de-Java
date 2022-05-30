/*
<< Padrão Estrutural >>
- Facade -> Prover uma interface que reduza a complexidade nas integrações com subsistemas.
 */

package Model.Facade.sistema;

import Model.Facade.subsistema.CepApi;
import Model.Facade.subsistema.CrmService;


public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
