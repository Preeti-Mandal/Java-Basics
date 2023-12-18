import java.util.*;

public class insertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 1, 3, 2 };

        // insertion sort

        for (int i = 1; i < arr.length; i++) { // Unsorted, i=0 => sorted
            int current = arr[i];
            int j = i - 1; // last index of sorted side
            while (j >= 0 && arr[j] > current) {
                // Keep swapping
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;
        }
        printArray(arr);
    }
}
