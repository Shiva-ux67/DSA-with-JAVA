package Recursion;

public class Fibonaci {
    public static void main(String[] args) {
        int ans = fibo(50);
        System.out.println(ans);
    }
    static int fibo(int n){
        // Base case
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
