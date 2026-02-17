import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int n = nums.length;
        if (n == 0) return;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int t = arr[left];
            arr[left++] = arr[right];
            arr[right--] = t;
        }
    }
}
