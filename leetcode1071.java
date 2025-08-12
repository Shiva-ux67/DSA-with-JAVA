public class leetcode1071 {

    // main method
    public static void main(String[] args) {
        leetcode1071 obj = new leetcode1071();
        String str1 = "ABCCDE";
        String str2 = "ABC";
        System.out.println("GCD of Strings: " + obj.gcdOfStrings(str1, str2));
    }

    // GCD of Strings method
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    // GCD of two numbers method
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
