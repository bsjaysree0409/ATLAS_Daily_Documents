package June21;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate values
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 40, 20, 50);

        // Remove duplicates using streams and collect to new list
        List<Integer> removedDups = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Display the list after removing duplicates
        System.out.println("List after removing duplicates: " + removedDups);
    }
}
