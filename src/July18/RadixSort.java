package July18;

public class RadixSort {

    // Function to get the maximum value in the array
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // A function to do counting sort based on the digit represented by exp
    static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];  // output array
        int[] count = new int[10];  // count array for digits 0 to 9

        // Count occurrences of digits
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Update count[i] so that it contains actual positions
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array (stable sort - go backwards)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the output array to original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // Main function to do radix sort
    static void radixSort(int[] arr) {
        int max = getMax(arr);  // Find the max number

        // Apply counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    // Utility function to print array
    static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original array:");
        printArray(arr);

        radixSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
