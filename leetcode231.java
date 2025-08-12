public class leetcode231 {
    public static void main(String[] args) {
        int n = 16;
        if(n <= 0){
            System.out.println("false");
        }
            while (n % 2 == 0){
                n /=2;
            }
        if(n == 1){
            System.out.println("true");
    }
    }
}
