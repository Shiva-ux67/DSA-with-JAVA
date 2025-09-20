package Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 10, 6};
        int min = arr[0]; 

        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }
        
        System.out.println("Minimum value is: " + min);
    }
}
