package worked_codes.July4;

import java.util.Scanner;

public class ReverseStringRecursive {

    // Recursive method to reverse a string
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }

        // Take the last character + reverse of the rest
        return reverse(str.substring(1)) + str.charAt(0);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
