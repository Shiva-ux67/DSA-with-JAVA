package Arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {99,3,5,2,7,8,14,54};
        int max = 0; // int min = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i]; //max = Math.max(max,arr[i])
            }
        }
        System.out.println("largest element is the: "+max);
    }
}
