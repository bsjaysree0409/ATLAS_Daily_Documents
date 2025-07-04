package worked_codes.July4;

public class DecimalToBinary {

    // Recursive function to convert decimal to binary
    public static void toBinary(int number) {
        if (number == 0) {
            return;
        }

        toBinary(number / 2); // Recursive call
        System.out.print(number % 2); // Print binary digit
    }

    public static void main(String[] args) {
        int decimal = 13;

        if (decimal == 0) {
            System.out.print("0");
        } else {
            System.out.print("Binary of " + decimal + " is: ");
            toBinary(decimal);
        }

        System.out.println(); // for newline
    }
}
