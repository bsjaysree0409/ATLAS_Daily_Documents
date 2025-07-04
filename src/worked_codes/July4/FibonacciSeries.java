package worked_codes.July4;

import java.util.Scanner;

public class FibonacciSeries {

    // Method to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printFibonacci(num);
        }

        scanner.close();
    }
}
