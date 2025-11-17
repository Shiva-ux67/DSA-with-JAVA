package LinkedList;

import java.util.ArrayList;

public class SwapNums {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("the original lsit: "+list);
        System.out.println();
        swap(list,0,3);
    }
     static void swap(ArrayList<Integer> list,int ind1, int ind2){
        int first = list.get(ind1);
        int second = list.get(ind2);
        list.set(ind1,second);
        list.set(ind2,first);
        System.out.print(list);
    }
}
