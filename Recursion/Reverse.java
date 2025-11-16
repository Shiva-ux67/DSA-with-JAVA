package Recursion;

public class Reverse {
    public static void main(String[] args) {
        int n = 1010111;
        fun(n);
        System.out.println(revers);
    }
    static int revers = 0;
    static void fun(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        revers = revers * 10 + rem;
        fun(n / 10);
    }
}
