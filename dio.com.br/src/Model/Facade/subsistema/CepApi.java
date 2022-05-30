package Model.Facade.subsistema;

public class CepApi {

    private static CepApi instancia = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Aracaju";
    }

    public String recuperarEstado(String cep){
        return "SE";
    }
}
