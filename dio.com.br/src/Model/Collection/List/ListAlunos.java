/*
- Dados as seguintes informações sobre os alunos, crie uma lista e ordene esta´lista mostrando:
(nome - sobrenome - sexo - cor - idade
 */

package Model.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Classe responsável por executar as ações da classes de implementações e comparações de dados.
public class ListAlunos {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>() {{
            add(new Aluno("Adriano", "Santos", "Masculino", "Parda", 45));
            add(new Aluno("Neide", "Santos", "Feminino", "Negra", 48));
            add(new Aluno("Roberto", "Valadares", "Masculino", "Branca", 28));
            add(new Aluno("Patricia", "Vieira", "Feminina", "Banca", 41));
            add(new Aluno("Carlos", "Vieira", "Masculino", "Parda", 37));
        }};

        alunos.sort(Comparator.comparing(Aluno::getNome));
        alunos.sort(Comparator.comparing(Aluno::getSobrenome));
        alunos.sort(Comparator.comparing(Aluno::getSexo));
        alunos.sort(Comparator.comparing(Aluno::getCor));
        alunos.sort(Comparator.comparing(Aluno::getIdade));

        System.out.println("\n---------------\tOrdem de Inserção\t---------------");
        System.out.println(alunos);

        System.out.println("\n---------------\tOrdem de Aleatória\t---------------");
        Collections.shuffle(alunos);
        System.out.println(alunos);

        System.out.println("\n---------------\tOrdem de Natural (Nome)\t---------------");
        Collections.sort(alunos);
        System.out.println(alunos);

        System.out.println("\n---------------\tOrdem de Sobrenome\t---------------");
        alunos.sort(new ComparatorSobrenome());
        System.out.println(alunos);

        System.out.println("\n---------------\tOrdem de Sexo\t---------------");
        alunos.sort(new ComparatorSexo());
        System.out.println(alunos);

        System.out.println("\n---------------\tOrdem de Cor\t---------------");
        alunos.sort(new ComparatorCor());
        System.out.println(alunos);

        System.out.println("\n---------------\tOrdem de Idade\t---------------");
        alunos.sort(new ComparatorIdade());
        System.out.println(alunos);

        System.out.println("\n---------------\tOrdem por Nome/Cor/Idade\t---------------");
        alunos.sort(new ComparatorNomeSobrenomeSexoCorIdade());
        System.out.println(alunos);
    }
}

// Classe responsável pela privacidade e segurança dos dados.
class Aluno implements Comparable<Aluno> {
    private String nome;
    private String sobrenome;
    private String sexo;
    private String cor;
    private int idade;

    public Aluno(String nome, String sobrenome, String sexo, String cor, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.getNome().compareToIgnoreCase(aluno.getNome());
    }

}

// Classe responsável por comparar e ordenar a lista por sobrenome dos alunos
class ComparatorSobrenome implements Comparator<Aluno> {

    @Override
    public int compare(Aluno g1, Aluno g2) {
        return g1.getSobrenome().compareToIgnoreCase(g2.getSobrenome());
    }
}

// Classe responsável por comparar e ordenar a lista por sexo dos alunos
class ComparatorSexo implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getSexo().compareToIgnoreCase(o2.getSexo());
    }
}

// Classe responsável por comparar e ordenar a lista por cor dos alunos
class ComparatorCor implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

// Classe responsável por comparar e ordenar a lista por idade dos alunos
class ComparatorIdade implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

// Classe responsável por comparar e ordenar a lista por várias maneiras possíveis dos alunos
class ComparatorNomeSobrenomeSexoCorIdade implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {

        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) {
            return nome;
        }

        int sobrenome = o1.getSobrenome().compareToIgnoreCase(o2.getSobrenome());
        if (sobrenome != 0) {
            return sobrenome;
        }

        int sexo = o1.getSexo().compareToIgnoreCase(o2.getSexo());
        if (sexo != 0) {
            return sexo;
        }

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if (cor != 0) {
            return cor;
        }

        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
