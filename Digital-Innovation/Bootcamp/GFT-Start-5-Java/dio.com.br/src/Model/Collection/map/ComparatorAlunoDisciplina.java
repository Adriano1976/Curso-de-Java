/*Crie uma classe Aluno que possua os atributos: nome, matricula.
Crie uma classe Curso que possua os atributos: nome, disciplina.
Em seguida, instancie 3 objetos alunos e 3 cursos, fazendo a relação entre eles dentro de um dicionário.
Feito isso, ordene esse dicionário por:
A) Nome da disciplina
a) Duração do curso;
b) Nome do aluno;
d) Matricula do aluno;
*/

package Model.Collection.map; // Elementos únicos (key) para cada valor (value)

import java.util.*;

public class ComparatorAlunoDisciplina {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Maria Santos", "da Costa", 100250);
        Aluno aluno2 = new Aluno("Neide Ferreira", "Santos", 100230);
        Aluno aluno3 = new Aluno("Roberto", "Marcedo", 100240);
        Aluno aluno4 = new Aluno("Geraldo", "Azevedo", 100250);
        Aluno aluno5 = new Aluno("Karla", "Gomes", 100260);

        Disciplina disciplina1 = new Disciplina("Java", 10);
        Disciplina disciplina2 = new Disciplina("JavaScript", 12);
        Disciplina disciplina3 = new Disciplina("Python", 9);
        Disciplina disciplina4 = new Disciplina("Sql", 8);
        Disciplina disciplina5 = new Disciplina("Css", 7);

        Map<Disciplina, Aluno> cursos = new HashMap<>() {{
            put(disciplina1, aluno1);
            put(disciplina2, aluno2);
            put(disciplina3, aluno3);
            put(disciplina4, aluno4);
            put(disciplina5, aluno5);
        }};

        System.out.println("\nExibindo Dicionário: ");
        for (Map.Entry<Disciplina, Aluno> entry : cursos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nExibindo e Ordenando Dicionário por Nome da Disciplina: ");
        Map<Disciplina, Aluno> nomeDisciplina = new TreeMap<>(cursos);
        for (Map.Entry<Disciplina, Aluno> entry : nomeDisciplina.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nExibindo e Ordenando Dicionário por Duração da Disciplina: ");
        Map<Disciplina, Aluno> duracaoDisciplina = new TreeMap<>(new ComparatorDuracaoDisciplina());
        duracaoDisciplina.putAll(cursos);
        for (Map.Entry<Disciplina, Aluno> entry : duracaoDisciplina.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nExibindo e Ordenando Dicionário por Nome do Aluno: ");
        Set<Map.Entry<Disciplina, Aluno>> setNomeAluno = new TreeSet<>(new ComparatorNomeAluno());
        setNomeAluno.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> entry : setNomeAluno) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nExibindo e Ordenando Dicionário por Sobrenome do Aluno: ");
        Set<Map.Entry<Disciplina, Aluno>> setSobrenomeAluno = new TreeSet<>(new ComparatorSobrenomeAluno());
        setSobrenomeAluno.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> entry : setSobrenomeAluno) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nExibindo e Ordenando Dicionário por Matrícula do Aluno: ");
        Set<Map.Entry<Disciplina, Aluno>> matriculaAluno = new TreeSet<>(new ComparatorMatriculaAluno());
        matriculaAluno.addAll(cursos.entrySet());
        for (Map.Entry<Disciplina, Aluno> entry : matriculaAluno) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

class ComparatorDuracaoDisciplina implements Comparator<Disciplina> {
    @Override
    public int compare(Disciplina o1, Disciplina o2) {
        return Integer.compare(o1.getDuracao(), o2.getDuracao());
    }
}

class ComparatorNomeAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {
    @Override
    public int compare(Map.Entry<Disciplina, Aluno> o1, Map.Entry<Disciplina, Aluno> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}

class ComparatorSobrenomeAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {
    @Override
    public int compare(Map.Entry<Disciplina, Aluno> o1, Map.Entry<Disciplina, Aluno> o2) {
        return o1.getValue().getSobrenome().compareToIgnoreCase(o2.getValue().getSobrenome());
    }
}

class ComparatorMatriculaAluno implements Comparator<Map.Entry<Disciplina, Aluno>> {
    @Override
    public int compare(Map.Entry<Disciplina, Aluno> o1, Map.Entry<Disciplina, Aluno> o2) {
        return Integer.compare(o1.getValue().getMatricula(), o2.getValue().getMatricula());
    }
}
