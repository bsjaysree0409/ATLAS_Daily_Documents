package worked_codes.July4;

public class DigitOperations {

    // Recursive method to count digits
    public static int countDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigits(number / 10);
    }

    // Recursive method to sum digits
    public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumDigits(number / 10);
    }

    // Main method
    public static void main(String[] args) {
        int num = 12345;

        int digitCount = (num == 0) ? 1 : countDigits(num); // handle 0
        int digitSum = sumDigits(num);

        System.out.println("Number: " + num);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }
}
