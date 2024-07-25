package Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExValoresArray {
    public static void main(String[] args) {
        
        Stream<Integer> numbersForValues = Stream.of(1,2,3,4,5);

        IntStream numbersFromArray = Arrays.stream(new int[]{1,2,3,4,5});

        
    }
}
