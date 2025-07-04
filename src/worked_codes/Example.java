package worked_codes;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        // Step 1: Unsorted arrays
        int[] arr1 = {75, 11, 34, 66};           // Unsorted
        int[] arr2 = {100, 1, 19, 50, 5, 89};    // Unsorted

        int n1 = arr1.length;
        int n2 = arr2.length;

        // Step 2: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 3: Create merge array
        int[] merge = new int[n1 + n2];

        // Step 4: Merge sorted arrays
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }

        // Step 5: Copy remaining elements
        while (i < n1) {
            merge[k++] = arr1[i++];
        }

        while (j < n2) {
            merge[k++] = arr2[j++];
        }

        // Step 6: Print arrays
        System.out.print("Sorted Array 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }

        System.out.print("\nSorted Array 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        System.out.print("\nMerged Sorted Array: ");
        for (int num : merge) {
            System.out.print(num + " ");
        }
    }
}

