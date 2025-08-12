import java.util.Scanner;

public class Sum_of_two_numbers {
    public static void main(String[] args){
        // This program calculates the sum of two numbers
        /*int first, last,sum;
        first = 23;
        last = 32;
        sum = first + last;
        System.out.println("The sum of Two numbers is :"+ sum);
        */
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a values: ");
        a = sc.nextInt();
        System.out.print("Enter the b value: ");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        sc.close();
    }
}
