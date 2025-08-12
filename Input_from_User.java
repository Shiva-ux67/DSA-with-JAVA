import java.util.Scanner;
public class Input_from_User {
    public static void main (String[] args){
        /*
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a num value :");
        num = sc.nextInt();
        System.out.println("The value of num is  : " +num);
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter you height in meters : ");
        double height = sc.nextDouble();
        System.out.println("Hello " + name + " Welcome to the Java programming world!");
        System.out.println("you are " + age + " years old");
        System.out.println("Your height is " + height + " meters.");
        sc.close();
        
    }
}
