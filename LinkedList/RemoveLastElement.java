package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
       this.data = data;
       this.next = null;
    }
}
public class RemoveLastElement {
    public static void main(String[] args) {
        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
        removeLast(head);
    }
    static void removeLast(Node head){
        if(head.next == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        printLL(head);
    }
    static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}
