package July18;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Make number positive if it's negative
        number = Math.abs(number);

        // Special case for 0
        if (number == 0) {
            System.out.println("It's a 1-digit number");
        } else {
            int count = 0;
            long temp = number;

            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            System.out.println("It's a " + count + "-digit number");
        }

        scanner.close();
    }
}
