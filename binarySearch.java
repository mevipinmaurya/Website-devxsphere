import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents potential overflow

            if (array[mid] == target) {
                return mid; // Target found
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example sorted array
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        int result = binarySearch(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
