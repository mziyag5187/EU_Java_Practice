import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1_IntStream_range {
    public static void main(String[] args) {

        IntStream
                .range(1,10)
                .forEach( num -> System.out.print(num + " "));

        IntStream
                .range(1,10)
                .skip(5)
                .forEach(System.out::println);







    }
}
