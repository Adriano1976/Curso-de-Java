package Application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(3, 4, 5, 6, 7, 9, 10, 12, 16, 19, 20, 26, 34, 40);

        Stream<Integer> integerStream = integerList.stream().
                map(integer -> integer * 10);
        System.out.println(Arrays.toString(integerStream.toArray()));

        int sum = integerList.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        List<Integer> newList = integerList.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * 10)
                .toList();
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
