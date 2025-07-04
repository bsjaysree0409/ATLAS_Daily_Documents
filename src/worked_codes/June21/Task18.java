package June21;

import java.util.stream.Stream;

public class Task18 {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);

        // Limit the stream further to 10 and print each number
        nums.limit(10)
                .forEach(System.out::println);
    }
}
