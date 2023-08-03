import java.util.List;

public class Banco {

    private static final String NOME = "Banco do Brasil";
    protected String nome;
    private List<Conta> contas;

    public Banco() {
        this.nome = Banco.NOME;
    }

    public Banco(String nome, List<Conta> contas) {
        this.nome = Banco.NOME;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    protected void imprimirNomeBanco(){
        System.out.printf("Banco: %s%n", nome);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
