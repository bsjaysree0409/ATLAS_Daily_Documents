package worked_codes.July4;

public class ReverseNullTerminated {

    // Recursive function to reverse a string until '\0'
    public static void reverseString(char[] str, int index) {
        // Base case: if null terminator or end of array
        if (index >= str.length || str[index] == '\0') {
            return;
        }

        // Recursive call
        reverseString(str, index + 1);

        // Print after recursive call (reversing order)
        System.out.print(str[index]);
    }

    public static void main(String[] args) {
        // Simulating a null-terminated string (note the '\0' at the end)
        char[] input = {'H', 'e', 'l', 'l', 'o', '\0'};

        System.out.print("Reversed string: ");
        reverseString(input, 0);
        System.out.println();
    }
}
