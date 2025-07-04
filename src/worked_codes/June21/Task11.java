package June21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);

        List<Integer> removDups= numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct numbers are");
        removDups.forEach(num->System.out.println(num));
    }
}
