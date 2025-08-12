package Arrays;
import java.util.Scanner;

public class ArrayIOU {
    public static void main(String[] args) {
        int[] arr = new int[10]; 
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter 10 numbers:");
        for (int j = 0; j < arr.length; j++) { 
            arr[j] = sc.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
