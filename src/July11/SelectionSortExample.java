package July11;

public class SelectionSortExample {

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current position is the minimum
            int minIndex = i;

            // Find the index of the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        int[] myList = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(myList);

        // Sort the array using selection sort
        selectionSort(myList);

        System.out.println("Sorted array:");
        printArray(myList);
    }
}
