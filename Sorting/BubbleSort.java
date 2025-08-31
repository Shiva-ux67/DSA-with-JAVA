package Sorting;

public class BubleSort {
    public static void main(String[] args) {
        
        int[] arr = {6,5,3,3,2,1};
        sort(arr);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
    static void sort(int[] arr){
        int n = arr.length;
        for(int turn  = 0; turn < n-1;turn++){
            for(int i = 0; i < n-1-turn;i++){
                int current = arr[i];
                int next = arr[i + 1];
                if(current > next){
                    int temp = current;
                    current = next;
                    next = temp;
                }
            }
        }
    }
}
