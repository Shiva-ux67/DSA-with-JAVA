package Arrays;

public class orderAgnosticBS {
    public static void main(String[] args) {
        /*
         1.elements  Should be the Sorted order
         2.low,mid,high
         */
        //int[] arr = {-18,-12,-4,0,1,2,3,4,4,6,8,9};
        int[] arr = {99,64,56,47,31,4,2,-2,-99};
        int k = 64;
        int ind = search(arr,k);
        System.out.println(ind+" this is the elemet index value...!");
    }
    static int search(int[] arr,int k){
        int low = 0,high = arr.length-1;

        //find the whether the array is sorted in ascending or descending
        
        boolean isAsc = arr[low] < arr[high];

        while(low <= high){
            int mid = low+(high - low)/2;
            if(arr[mid] == k){
                return mid;
            }

            if(isAsc){
               if(arr[mid] < k){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }else{
                if(arr[mid] > k){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
}
}
