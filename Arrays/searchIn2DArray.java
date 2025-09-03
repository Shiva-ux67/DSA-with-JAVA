package Arrays;
import java.util.*;
public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {32,54,67},
            {43,76,88,7},
            {2,43,55,78,2}
        };
        int target = 55;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    } 
    static int[] search(int[][] arr, int target ){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        } 
        return new int[]{-1,-1};
     }
}
