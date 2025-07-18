package July18;

import java.util.ArrayList;

public class DigitGrouping {
    public static void main(String[] args) {
        int[] numbers = {45, 81, 85, 100, 20, 95, 60, 10, 21};

        ArrayList<Integer> array1 = new ArrayList<>(); // unit digit 0
        ArrayList<Integer> array2 = new ArrayList<>(); // unit digit 1
        ArrayList<Integer> array3 = new ArrayList<>(); // all others

        for (int num : numbers) {
            int unitDigit = num % 10;

            if (unitDigit == 0) {
                array1.add(num);
            } else if (unitDigit == 1) {
                array2.add(num);
            } else {
                array3.add(num);
            }
        }

        System.out.println("Array 1 has: " + array1);
        System.out.println("Array 2 has: " + array2);
        System.out.println("Array 3 has: " + array3);
    }
}
