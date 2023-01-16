import java.util.stream.IntStream;

public class Ex2_IntStream_sum {

    public static void main(String[] args) {

        int sumOf1to10 = IntStream
                                  .range(1,10)
                                  .sum();

        System.out.println(sumOf1to10);


    }


}
