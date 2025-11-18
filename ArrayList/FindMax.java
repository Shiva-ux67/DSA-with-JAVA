package ArrayList;
import java.util.*;
public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(9);
        list.add(111);
        max(list);
    }
    static void max(ArrayList<Integer> list){
            int maxi = Integer.MIN_VALUE;
            int len = list.size();
            for(int i = 0; i < len; i++) {
                    maxi = Math.max(list.get(i),maxi);
            }
        System.out.println(maxi);
    }
}
