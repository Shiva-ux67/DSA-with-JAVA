package LinkedList;

public class ReverseLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        Node prev = null;
        Node next = null;
        Node curr = head;
        printLL(head);
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
        System.out.println();
        printLL(head);
    }
    static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
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
