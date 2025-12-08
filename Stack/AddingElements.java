package Stack;


class myStack {
    // Array to store elements
    private int[] arr;
    // Maximum size of the array
    private int capacity;
    // Top most element in the Stack
    private int top;

    public myStack(int cap) {
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }
    public void printStack(){
        for (int i = 0; i <= top ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class AddingElements {
    public static void main(String[] args) {
        myStack st = new myStack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.print("Pushed Elements ");
        st.printStack();
    }
}
