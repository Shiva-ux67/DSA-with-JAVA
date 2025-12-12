package Trees;

public class LInkedListTreeRecursion {
    public static void main(String[] args) {
        Node head = new Node(10);
         head.next = new Node(20);
         head.next.next= new Node(40);
         head.next.next.next = new Node(50);


//         Node temp = head;
//         while(temp != null){
//             System.out.println(temp.data);
//             temp = temp.next;
//         }


        // Using the Recursion for better understanding
        recursionLL(head);
    }
    static void recursionLL(Node head){
        if(head == null) return;

        recursionLL(head.next);
        // it will print the LinkedList on the Reverse way for WHY means it is call the function first and
        // that all values are stored the STACK for printing that is print the stack principle Using //LILO(Last In Last Out)
        System.out.println(head.data);
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