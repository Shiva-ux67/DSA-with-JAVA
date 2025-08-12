package Arrays;

import java.util.Arrays;

public class CompareArray {
    public static void main(String[] args) {
        int[] a = { 1, 2 };
        int[] b = { 1, 2 };
        System.out.println(Arrays.equals(a, b));

        int[][] m1 = { { 1, 2 }, { 3, 4 } };
        int[][] m2 = { { 1, 2 }, { 3, 4 } };
        System.out.println(Arrays.deepEquals(m1, m2));
    }
}
