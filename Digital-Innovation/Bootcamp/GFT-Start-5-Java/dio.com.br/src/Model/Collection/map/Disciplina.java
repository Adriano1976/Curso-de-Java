/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e para cada aluno uma lista contendo 2 cursos
fazendo a relação entre eles dentro de um dicionário.
Feito isso, exiba o dicionário com os seguintes requisitos:
Key: Nome do aluno e matrícula — Value: Nome das disciplinas onde estão matriculados
*/

package Model.Collection.map;

import java.util.Objects;

//Crie uma classe Curso que possua os atributos: Disciplina, matricula
public class Disciplina implements Comparable<Disciplina> {

    private String nome;
    private Integer duracao;

    public Disciplina(String nome, Integer duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != getClass()) return false;
        Disciplina disciplina = (Disciplina) obj;
        return this.nome.equals(disciplina.nome) && duracao.equals(disciplina.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, duracao);
    }

    @Override
    public int compareTo(Disciplina o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}
