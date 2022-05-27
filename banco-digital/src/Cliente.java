public class Cliente {

    private String nome;
    private String sobreNome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String sobreNome, String cpf, int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
