package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        /*
         1.elements  Should be the Sorted order
         2.low,mid,high
         */
        int[] arr = {1,2,3,4,4,6,8,9};
        int k = 1;
        int ind = search(arr,k);
        System.out.println(ind+" this is the elemet index value...!");
    }
    static int search(int[] arr,int k){
        int low = 0,high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
