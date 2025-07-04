package June21;

import java.util.*;
import java.util.stream.Collectors;

public class Task15_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Accept 5 integers from user
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        // Use stream to compute squares and collect to a new list
        List<Integer> squareOfNums = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        // Display squared numbers
        System.out.println("\nSquares of the entered numbers:");
        for (int i = 0; i < squareOfNums.size(); i++) {
            System.out.println("Square of " + numbers.get(i) + " is: " + squareOfNums.get(i));
        }

        scanner.close();
    }
}
