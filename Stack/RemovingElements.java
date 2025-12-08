package Stack;


/*
 Stack Using Array


lass remove{
    private  int[] arr;
    private int capacity;
    private int top;

    public remove(int x){
        capacity = x;
        arr = new int[capacity];
        top = -1;
    }
    public void push(int x){
        if(top == capacity - 1){
            System.out.print("Stack is Overflow");
            return;
        }
        arr[++top] = x;
    }
    public int pop(){
        if(top == -1){
            System.out.print("Stack is UnderFlow");
            return -1;
        }
        return arr[top--];
    }
}
public class RemovingElements {
    public static void main(String[] args) {
        remove st  = new remove(4);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.print("Popped Elements : " + st.pop() +" "+  st.pop());

    }
}
*/


import java.util.ArrayList;

class stack{
    ArrayList<Integer> list = new ArrayList<>();

    void push(int data){
        list.add(data);
    }

    void pop(){
        if(isEmpty()){
            return;
        }
        int last = list.get(list.size()-1);
        list.remove(list.size() - 1);
        System.out.println(last);
    }
    boolean isEmpty(){
        if(list.size() == 0){
            return true;
        }
        return false;
    }
}


public class RemovingElements {
    public static void main(String[] args) {
        stack st  = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.print("Popped Elements : " );
        st.pop();
        st.pop();

    }
}