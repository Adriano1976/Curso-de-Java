package entities;

// A classe entities.Account com um construtor que inicializa o nome.
public class Account {
    private String name; // Variável de instância.

    // Construtor, que tem o nome da classe, inicializa name com nome do parâmetro.
    public Account(String name) {
        this.name = name;
    }

    // Método para configurar o nome.
    public void setName(String name) {
        this.name = name;
    }

    // Método para recuperar o nome do curso.
    public String getName() {
        return name;
    }
} // fim da classe entities.Account.
