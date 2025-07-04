package June21;

import java.util.stream.Stream;

public class Task19_1 {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);

        // Skip first 15 numbers
        Stream<Integer> skipNums = nums.skip(12);

        // Print the remaining numbers
        skipNums.forEach(System.out::println);
    }
}
