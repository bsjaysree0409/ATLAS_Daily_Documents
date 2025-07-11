package July11;

public class InsertionSortExample {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i];     // Current element to insert
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at its correct position
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] myList = {29, 10, 14, 37, 14};

        System.out.println("Original array:");
        printArray(myList);

        // Sort the array using insertion sort
        insertionSort(myList);

        System.out.println("Sorted array:");
        printArray(myList);
    }
}
