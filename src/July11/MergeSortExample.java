package July11;

public class MergeSortExample {

    // Method to sort the array using merge sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Recursively sort first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    public static void merge(int[] array, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];

        // Merge the temp arrays

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array)
            System.out.print(num + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] data = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array:");
        printArray(data);

        mergeSort(data, 0, data.length - 1);

        System.out.println("Sorted array:");
        printArray(data);
    }
}
