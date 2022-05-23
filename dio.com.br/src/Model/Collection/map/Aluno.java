/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e para cada aluno uma lista contendo 2 cursos
fazendo a relação entre eles dentro de um dicionário.
Feito isso, exiba o dicionário com os seguintes requisitos:
Key: Nome do aluno e matrícula — Value: Nome das disciplinas onde estão matriculados
*/

package Model.Collection.map;

import java.util.Objects;

//Crie uma classe Aluno que possua os atributos: nome, sobrenome, matrícula(cpf).
public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer matricula;

    public Aluno(String nome, String sobrenome, Integer matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return nome.equals(aluno.nome) && sobrenome.equals(aluno.sobrenome) && matricula.equals(aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome, matricula);
    }
}
