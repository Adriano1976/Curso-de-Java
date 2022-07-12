package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>{

    // Generics '<T>' permitem que classes, ‘interfaces’ e métodos possam ser parametrizados por tipo.
    private final List<T> list = new ArrayList<>();

    // Adicionando um valor qualque na lista do tipy 'T'
    public void addValue(T value) {
        list.add(value);
    }

    // Verificando se a lista está vazia, pois se estiver vazia, informa o problema.
    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    // Método responsável para imprimir os valores conforme os parâmetros.
    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
