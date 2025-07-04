package June21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);

        List<Integer> squareofNums = numbers.stream()
                .map(num->num*num)
                .collect(Collectors.toList());

        squareofNums.forEach(number->System.out.println(number));


    }
}
