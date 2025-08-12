import java.util.Scanner;
public class MultiplyTable {
    public static void main(String[] args) {
        System.out.print("enter n value:  ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for( int i= 1; i<= n ; i++){
            for ( int j = 1; j<=10;j++){
                System.out.println(i + " * "+j+" = "+ i*j);
            }
            System.out.println();
        }
        sc.close();
    }
}
