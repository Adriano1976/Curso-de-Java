package Application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 9, 10, 12, 16, 19, 20, 26, 34, 40);
        Stream<Integer> integerStream = list.stream();
        System.out.println("Integer stream: " + Arrays.toString(integerStream.toArray()));

        Stream<String> stringStream = Stream.of("Adriano", "Laura", "Nadja", "Bianca", "Karla", "Pedro");
        System.out.println("String stream: " + Arrays.toString(stringStream.toArray()));

        Stream<Integer> stream = Stream.iterate(0, x -> x + 10);
        System.out.println("Integer stream: " + Arrays.toString(stream.limit(20).toArray()));

        Stream<Long> longStream = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println("Fribonacy sequency: " + Arrays.toString(longStream.limit(20).toArray()));
    }
}
