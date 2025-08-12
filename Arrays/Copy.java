package Arrays;
import java.util.Arrays;
public class Copy {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = Arrays.copyOf(a,6);
        System.out.println(Arrays.toString(b));
    }
}
