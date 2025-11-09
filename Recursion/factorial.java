package Recursion;

public class factorial {
    //  One way to solve the factorial problem using the function only

    /*public static void main(String[] args) {
        int n = 6;
        
        System.out.println(factor(n));
    }

    static int factor(int n){
        int fact = 1;

        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }
        return fact;
    }*/
    


// This is for the Recursion using the factorial 
    public static void main(String[] args) {
        int n = 9;
        int fact = factor(n);
        System.out.println(fact);
    }
    public static int factor(int n){
        // Base Case
        if(n == 1 || n == 0){
            return 1;
        }

        // Recursive Case

        int result = n * factor( n - 1);
        return result;
    }
}
