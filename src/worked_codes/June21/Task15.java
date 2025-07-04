package June21;

import java.util.stream.Stream;

public class Task15 {
    public static void main(String[] args) {

        Stream<Integer> nums = Stream
                .iterate(1, n -> n+1)
                .limit(20);

        Stream<Integer> skipped = nums.skip(15);

        skipped.forEach(System.out::println);


    }
}
