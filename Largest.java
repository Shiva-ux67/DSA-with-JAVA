import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a, b, c;
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b c value: ");
        a = sc.nextInt();
        
        b = sc.nextInt();
     
        c = sc.nextInt();
        s = (a == b && b == c) ? "All values are equal: " + a
                : (a >= b && a >= c) ? "Largest number a: " + a
                        : (b >= c && b >= a) ? "Largest number b: " + b
                                : "Largest number c: " + c;

        System.out.println(s);
        sc.close();
    }
}