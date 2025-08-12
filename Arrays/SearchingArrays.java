package Arrays;
import java.util.Arrays;

public class SearchingArrays {
    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 36, 7};

        Arrays.sort(nums);

        // only works correctly on a sorted array.
        int index = Arrays.binarySearch(nums, 7);

        System.out.println("Sorted array: " + Arrays.toString(nums));
        System.out.println("Index of 7: " + index);
    }
}
