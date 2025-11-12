package Recursion;

public class SumofNumbers {
    public static void main(String[] args) {
        int n = 5;
        int ans = sum(n);
        System.out.println(ans);
    }
    public static int sum(int n){
        // Base Case
        if(n == 0){
            return 0;
        }

        // Recursive Case

        int result = n + sum( n - 1);
        return result;
    }
}
