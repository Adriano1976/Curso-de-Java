/*
- Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
 */

package Model.Collection.set; // Não permite elementos duplicados e nem possui índice.

import java.util.*;

public class MinhaLinguagemFavoritas {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhaLinguagemFavoritas = new HashSet<>();
        minhaLinguagemFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhaLinguagemFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "Intellij"));
        minhaLinguagemFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));

        System.out.println("\n----------------------- Ordem por Inserção (Nome) -----------------------\n");

        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Python", 1991, "Pycharm"),
                        new LinguagemFavorita("JavaScript", 1995, "Intellij"),
                        new LinguagemFavorita("Java", 1991, "Visual Studio Code")
                )
        );

        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) {
            System.out.println(linguagem);
        }

        System.out.println("\n-------------------------- Ordem Natural (Nome) --------------------------\n");

        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhaLinguagemFavoritas);
        for (LinguagemFavorita linguagens : minhasLinguagensFavoritas2) {
            System.out.println(linguagens);
        }

        System.out.println("\n-------------------------- Ordem por IDE (Nome) --------------------------\n");

        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhaLinguagemFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) {
            System.out.println(linguagem);
        }

        System.out.println("\n----------------------\tOrdem Ano de Criacao e Nome\t----------------------\n");

        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        minhasLinguagensFavoritas4.addAll(minhaLinguagemFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) {
            System.out.println(linguagem);
        }

        System.out.println("\n------------------\tOrdem Nome - Ano de Criacao - IDE\t------------------\n");

        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) {
            System.out.println(linguagem);
        }

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);

        if (anoDeCriacao != 0) return anoDeCriacao;
        return o1.nome.compareToIgnoreCase(o2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.nome.compareToIgnoreCase(o2.nome);
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);

        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return o1.ide.compareToIgnoreCase(o2.ide);
    }
}