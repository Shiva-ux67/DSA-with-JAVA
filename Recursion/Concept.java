package Recursion;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n == 0) {

            return;
        }
        System.out.println(n);
        //fun(n--); // it will give the StackOverflowError this line is the 5 only
        fun(--n); // it is gives the result  5 4 3 2 1

    }
}
