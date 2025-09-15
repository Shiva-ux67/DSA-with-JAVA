package Arrays;
// Amazon interview Question 
public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,13,17,23,54,87,91,123,167,290,300};
        int target = 54;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size is 2 
        int start = 0;
        int end = 1;

        // Condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // double the box size
            // end = previous end + sizeofbox * 2

            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr, target, start,end);
    }
    static int search(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start+(end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
