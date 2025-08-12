import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("It is an leap year: "+ year);
        }
        else {
            System.out.println("It is **not** a leap year: " + year);
        }
        sc.close();
    }
}
