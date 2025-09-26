
public class pallindrome {
    public static void main(String[] args) {
        
        String name = "racecbr";
        int n = name.length();
        for(int i = 0; i < n / 2;i++){
            if(name.charAt(i) != name.charAt(n -1 - i)){
                System.out.println("It is not pallindrome");
                return;
            }
        }
        System.out.println("It is pallindrome");
    }
}
