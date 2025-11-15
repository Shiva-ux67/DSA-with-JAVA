package Sorting;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        subarray(arr);
    }
    static void subarray(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int k = i; k < array.length; k++) {
                
                for (int j = i; j <= k; j++) {
                    System.out.print(array[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
