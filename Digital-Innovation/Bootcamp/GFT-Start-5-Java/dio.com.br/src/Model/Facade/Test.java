/*
<< Padrão Estrutural >>
- Facade -> Prover uma interface que reduza a complexidade nas integrações com subsistemas.
 */

package Model.Facade;

import Model.Facade.sistema.Facade;

public class Test {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.migrarCliente("Roberto da Silva Santana", "49000-510");
    }
}
