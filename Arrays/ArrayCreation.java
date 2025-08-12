package Arrays;

import java.util.Arrays;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 23;
        //printing arrays
        int[] a = {1,2,3,4,5,6,7};
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(a));


        int[][] matrix = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrix));
    }
}
