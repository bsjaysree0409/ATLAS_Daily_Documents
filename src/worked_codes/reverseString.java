package worked_codes;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object


        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();


        String reversed = reverseString(input);


        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString(); // Using StringBuilder's reverse method
    }
}
