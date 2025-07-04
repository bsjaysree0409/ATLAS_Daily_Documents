package June21;

import java.util.*;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public static void main(String[] args) {
        // Create an ArrayList with some numbers (you can also take input if needed)
        List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 41);

        // Filter odd numbers using streams and collect into a new list
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        // Display the odd numbers
        System.out.println("Odd numbers are: " + oddNumbers);
    }
}
