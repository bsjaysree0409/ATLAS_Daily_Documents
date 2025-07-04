package worked_codes.July4;

public class ArrayCopyRecursive {

    // Recursive method to copy elements from source[] to destination[]
    public static void copyArray(int[] source, int[] destination, int index) {
        // Base case: if end of array is reached
        if (index >= source.length) {
            return;
        }

        // Copy current element
        destination[index] = source[index];

        // Recursive call for next index
        copyArray(source, destination, index + 1);
    }

    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[source.length];

        copyArray(source, destination, 0);

        // Print destination array
        System.out.print("Copied array: ");
        for (int num : destination) {
            System.out.print(num + " ");
        }
    }
}
