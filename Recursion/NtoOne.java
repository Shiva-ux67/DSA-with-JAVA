package Recursion;

public class NtoOne {
    // N to 1 for using the fuction 
   /*  public static void main(String[] args) {
        int n = 10;
        get(n);
        
    }
    static void get(int n){
        for (int i = n; i > 0; i--) {
            System.out.print(i+ " ");
        }
    }*/

//Using the Recursion 
    public static void main(String[] args) {
        int n = 20;
        get(n);
    }
    static void get(int n){
        // Base case
        if(n == 0){
            return;
        }

        System.out.print(n+" ");
        get(n - 1);
    }
}
