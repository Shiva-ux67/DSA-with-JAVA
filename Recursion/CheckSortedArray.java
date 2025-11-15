package Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,4};
        check(arr.length - 1, arr);
    }
    static void check(int n,int[] arr){
        if(n == 0){
            System.out.println("Sorted");
            return;
        }
        if(arr[n] < arr[n - 1]){
            System.out.println("Not Sorted");
            return;
        }
        check(n-1,arr);
    }
}
