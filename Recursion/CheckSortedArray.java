package Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,4};
        //check(arr.length - 1, arr);
        System.out.println(sorted(arr,0));
    }
    /*static void check(int n,int[] arr){
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

     */
    static boolean sorted(int[] arr,int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted( arr,index + 1);
    }
}
