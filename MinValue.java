

public class MinValue {
    public static void main(String[] args){
        int[] arr = {4,2,6,8,3,2,5,1,9};
        int minValue = arr[0];
        for (int i : arr){
            if(i < minValue){
                minValue = i;
            }
        }
        System.out.println(("minimum value is:"+minValue));
    }
}
