package worked_codes.July4;

public class RecursiveSearch {

    // Recursive method to search for an element
    public static int recursiveSearch(int[] arr, int target, int index) {
        // Base case: reached end of array
        if (index >= arr.length) {
            return -1; // not found
        }

        // If element found
        if (arr[index] == target) {
            return index;
        }

        // Recursive call for next index
        return recursiveSearch(arr, target, index + 1);
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {5, 8, 12, 3, 7, 9};
        int target = 3;

        int result = recursiveSearch(array, target, 0);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

