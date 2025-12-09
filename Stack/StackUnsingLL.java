package Stack;

public class StackUnsingLL {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        s.pop();
        s.pop();
        s.push(94);
        s.pop();
        s.pop();
        s.pop();
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

class Stack{
    Node head = null;

    void push(int data){
        if(head == null){
            this.head = new Node(data);
        }

        else{
            Node temp = this.head;
            while(temp.next != null){
            temp = temp.next;
        }
          temp.next = new Node(data);
    }}

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }else{

            Node temp = this.head;
            Node prev = temp;
            if(temp.next == null){
               System.out.println(temp.data);
                this.head = null;
                return;
            }
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            System.out.println(temp.data);
            prev.next = null;

        }
    }
    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

}