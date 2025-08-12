public class GCDproblem {
    public static int gcd(int a, int b) {
    //     if (b == 0)
    //         return a;
    //     return gcd(b, a % b);
    // }
    while (a != b){
        if (a > b)
            a =a - b;
        else
            b = b - a;      
    }
    return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(20, 30)); // Output: 10
    }
}
