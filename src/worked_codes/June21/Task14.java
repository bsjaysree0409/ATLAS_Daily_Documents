package June21;

import java.util.stream.Stream;

public class Task14 {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream
                .iterate(1, n -> n+1)
                .limit(20);

        nums.limit(10).forEach(System.out::println);

    }
}
