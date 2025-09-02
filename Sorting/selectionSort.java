package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 43, 23, 54, 1, 0 };
        sort(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < n ; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
