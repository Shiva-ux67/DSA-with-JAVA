package Queues;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
       Queue q = new Queue();
       q.enqueue(1);
       q.enqueue(2);
       q.enqueue(3);
       q.enqueue(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }
}

class Queue{
    ArrayList<Integer> list = new ArrayList<>();

    void enqueue(int data){
        list.add(data);
    }

    int dequeue(){
        if (isEmpty()) { // list.isEmpty we can use this also
            return -1;
        }
        int num = list.get(0);
        list.remove(0);
        return num;
    }
    boolean isEmpty(){
        if(list.size() == 0){
            return true;
        }
        return false;
    }

}
