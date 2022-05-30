/*
<< Padrão Comportamentol >>
- Singleton -> Permitir a criação de uma única instância de uma classe e fornecer
um modo para recuperá-la.
- Singleton "lento"
 */

package Model.Singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    public SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}


