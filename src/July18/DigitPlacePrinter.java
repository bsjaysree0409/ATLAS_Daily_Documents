package July18;
import java.util.Scanner;

public class DigitPlacePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a 6-digit number: ");
        int number = scanner.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("Please enter a valid 6-digit number.");
        } else {
            int units = number % 10;
            int tens = (number / 10) % 10;
            int hundreds = (number / 100) % 10;
            int thousands = (number / 1000) % 10;
            int tenThousands = (number / 10000) % 10;
            int lakhs = number / 100000;

            System.out.println("Units digit is " + units);
            System.out.println("Ones digit is " + tens);
            System.out.println("Hundreds digit is " + hundreds);
            System.out.println("Thousands digit is " + thousands);
            System.out.println("10 thousands digit is " + tenThousands);
            System.out.println("Lakhs digit is " + lakhs);
        }

        scanner.close();
    }
}
