/*
<< Padrão Comportamental >>
- Singleton -> Permitir a criação de uma única instância de uma classe e
fornecer um modo para recuperá-la.
- Singleton "Lazy Holder".
- @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */

package Model.Singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
