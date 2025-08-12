import java.util.Scanner;
public class ReverseOfNum {
    public static void main(String[] args) {
        int num, reversed = 0, lastDigit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        for (;num > 0;num /= 10) {
            lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;   
        }
        
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
