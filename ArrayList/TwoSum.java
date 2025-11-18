package ArrayList;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,8,11};
        int target = 9;
        int[] ans = sum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
//    static int[] sum(int[] arr,int target){
//        int[] res ={-1,-1};
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j <arr.length - 1; j++) {
//                if(target == arr[i] + arr[j]) {
//                    res[0] = i + 1;
//                    res[1] = j + 1;
//                    return res;
//                }
//            }
//
//        }
//        return res;
//    }
    static int[] sum(int[] arr,int target){
        int i =0;
        int j = arr.length - 1;
        int[] res = {-1,-1};
        while(i < j) {
            if (target == arr[i] + arr[j]) {
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }

}
