package Queues;

public class QueueUsingLL {
    public static void main(String[] args) {
    myQueue q = new myQueue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println("The currrent size for the Queue : " + q.getSize());

    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class myQueue{
    private Node front;
    private Node rear;
    private int currSize;

    myQueue(){
        currSize = 0;
        front = rear = null;
    }


    boolean isEmpty(){
       return (front == null) ;
    }
    void enqueue(int data){
        Node li = new Node(data);
        if(isEmpty()){
            front = rear = li;
        }else{
            rear.next = li;
            rear = li;
        }
        currSize ++;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        Node temp = front;
        int removeFront = temp.data;
        front = front.next;
        currSize --;
        return removeFront;

    }

    int getSize(){
        return currSize;
    }
}