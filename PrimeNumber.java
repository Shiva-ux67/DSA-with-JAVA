import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int c = 2;
        if (num <= 1) {
            System.out.println("Not a prime number");

        } else {
            while (num >= c*c) {
                if (num % c == 0) {
                    System.out.println(" not  a prime number");
                    return;
                }
                c += 1;
            }
            System.out.println(" it is a prime number");
        }
        sc.close();
    }
}
