package LinkedList;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
// add,remove,get,set,contains
    list.add(3);
    list.add(4);
    list.add(5);
    list.remove(1);
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("this is the list size: "+list.size());
        list.set(1,99);
        System.out.println("the elements are in the LinkedList: "+list);
        System.out.println("the elements is in the Array list: "+list.contains(99));
    }
}
