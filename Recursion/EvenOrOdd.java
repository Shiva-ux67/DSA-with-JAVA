public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 51;
        System.out.println("this is Even number:"+ even(n));
    }
    private static boolean even(int n){
        return(n & 1) == 0;
    }
}
