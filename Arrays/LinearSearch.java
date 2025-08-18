package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {75,32,23,43,54,21,43,65,2,4};
        int target = 54;
        for(int i=0;i < arr.length;i++){
            if(arr[i] == target){
                System.out.println(i+" index we find the target");
                break;
            }
        }
    }
}
