package worked_codes.July4;

import java.util.Scanner;

public class FactorialExample {

    // Iterative method
    public static long factorialIterative(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Recursive method
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial (Iterative) of " + num + " is: " + factorialIterative(num));
            System.out.println("Factorial (Recursive) of " + num + " is: " + factorialRecursive(num));
        }

        scanner.close();
    }
}
