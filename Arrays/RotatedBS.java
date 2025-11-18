
public class RotatedBS {
    // asked google interveiw leetcoe 33 problem
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        if(pivot == -1){
            return Bsearch(nums,target,0,nums.length - 1);
        }
        return -1;
    }

    static int Bsearch(int[] arr,int k, int low,int high){
        
        while(low <= high){
            int mid = low+(high - low)/2;
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
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;

            }else{
               start = mid + 1; 
            }
        }
        return -1;
    }
}
