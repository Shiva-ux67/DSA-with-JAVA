package Sorting;

public class PairsInArray {
    public static void main(String[] args) {
        
        int[] arr = {1,3,4,6,4,2,6,7};
        findpair(arr,8);
    }

    static void findpair(int[] arr, int sum){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j< n; j++) {
                if(arr[i] + arr[j] == sum){
                    System.out.print("("+ arr[i] + ","+arr[j]+")" + " ");
                }
            }
            
        }
    }

}