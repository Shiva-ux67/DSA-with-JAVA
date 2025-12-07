package LinkedList;

class Node{
    int data;
    Node next;

    Node(int newData){
        this.data =newData;
        this.next = null;
    }
}
public class BasicList {
    public static void main(String[] args) {
        // Create the first node (head of the list)
        Node head = new Node(10);
        //Link The second node
        head.next =new Node(20);
        // Link the second node
        head.next.next = new Node(30);
        // Link the fourth node
        head.next.next.next = new Node(40);

        // printing linked list
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
