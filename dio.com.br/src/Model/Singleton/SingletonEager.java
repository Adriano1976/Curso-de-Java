/*
<< Padrão Comportamental >>
- Singleton -> Permitir a criação de uma única instância de uma classe e
fornecer um modo para recuperá-la.
- Singleton "apressado".
 */

package Model.Singleton;

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
