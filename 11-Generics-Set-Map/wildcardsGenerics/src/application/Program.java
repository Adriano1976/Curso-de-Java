package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28, 12.76, 0.15);
//        List<String> myStrings = Arrays.asList("Adriano", "Neide", "Laura");
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);

        copy(myDoubles, myObjs);
        printList(myObjs);

//        copy(myStrings, myObjs); -> No acept copy type String to Number.
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        destiny.addAll(source);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();
    }
}
