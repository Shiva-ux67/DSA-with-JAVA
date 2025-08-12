import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int num,sum = 0, lastdigit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        // while(num != 0){
        //     lastdigit = num % 10;
        //     sum += lastdigit;
        //     num = num/ 10;
        // }
        for (int i = num; i !=0; i /= 10) {
            lastdigit = i % 10;
            sum += lastdigit;
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
