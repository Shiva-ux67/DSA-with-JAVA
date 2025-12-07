package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class AddInMiddle {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next =new Node(20);
        head.next.next =new   Node(30);
        head.next.next.next =new   Node(40);
        int len = lengthLL(head);
        System.out.println(len);
        int half = len/2;
        AddMid(head,half);
    }
    static void AddMid(Node head, int half){
        if(half == 0){
            return;
        }
        Node temp = head;
        int c = 0;
        while(temp != null){
            temp = temp.next;
            c++;
            if(c == half - 1){
                Node newNode = new Node(50);
                newNode.next = temp.next;
                temp.next = newNode;

            }
        }
            printLL(head);
        }
            static void printLL(Node head){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
    }


    static int lengthLL(Node head){
        int count = 0;
        if(head == null){
            return 0;
        }
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}

