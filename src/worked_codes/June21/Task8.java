package June21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);

        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 !=0)
                .collect(Collectors.toList());

        System.out.println("ODD numbers are");
        oddNumbers.forEach(num->System.out.println(num));

    }
}
