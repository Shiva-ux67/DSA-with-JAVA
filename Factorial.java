public class Factorial {
    public static void main(String[] args) {
        int num = 5,f= 1;
        for (int i = num ; i > 0;i--){
            f = f* i;
        }
        System.out.println("Factorial of " + num + " is: " + f);
    }
}
