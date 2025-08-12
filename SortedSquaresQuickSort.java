import java.util.Arrays;

public class SortedSquaresQuickSort {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;

        // Step 1: Square each element
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Step 2: Sort using QuickSort
        quickSort(nums, 0, n - 1);

        return nums;
    }

    // QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    // Swap helper method
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to run in VS Code
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
}
