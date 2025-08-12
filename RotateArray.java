import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int n = nums.length;
        while (k > 0)
        {
            for (int i = 0; i <= n; i++) 
            {
                nums[i] = nums[n-1-i];
            }
            k--;
        }
        System.out.print("Rotated Array: " + nums);
    }
}
