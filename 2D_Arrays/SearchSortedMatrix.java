import java.util.Arrays;

public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 91;
        getElement(arr,target);
        

    }
    public static void getElement(int[][] arr, int target){
        int m = arr.length;
        int n = arr[0].length;
        int row = 0;
        int col = n - 1;
        while(row < m && col >= 0){
            if(arr[row][col] == target){
                System.out.println("element is founded at index: [" + row + "," + col + "]");
                return ;
            }
            else if(arr[row][col] > target){
                col --;
            }else{
                row++;
            }
        }
        System.out.println("Element not fount");
    }
}
