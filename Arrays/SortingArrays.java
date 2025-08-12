package Arrays;
import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        
        int[] nums = {7,3,5,2,1,7,4,6,9};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // Custom sort (For Objects)

        String[] names = {"Shiva","Akhil","Praveen","Guna"};
        Arrays.sort(names, (a,b) -> b.compareTo(a));
        System.out.println(Arrays.toString(names));
    }
}
