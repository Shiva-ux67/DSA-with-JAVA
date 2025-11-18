package ArrayList;

public class MostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(container(arr));
    }
//    static int container(int[] arr){
//        int maxi = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length ; j++) {
//                int width = j - i;
//                int heigth = Math.min(arr[i],arr[j]);
//                int water = width * heigth;
//                maxi = Math.max(maxi,water);
//            }
//        }
//        return maxi;
//    }
    static int container(int[] arr){
        int maxi = 0;
        int i = 0;
        int j = arr.length - 1;
        while(i<j){

                int width = j - i;
                int heigth = Math.min(arr[i],arr[j]);
                int water = width * heigth;
                maxi = Math.max(maxi,water);

                if(arr[i]<arr[j]){
                    i++;
                }else{
                    j--;
                }
            }

        return maxi;
    }
}
