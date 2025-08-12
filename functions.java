public class functions {
    public static void main(String[] args) {
    //     int a = 100;
    //     int sum = Add(3,4);
    //     System.out.println(a); // output is 100
    //     System.out.println("sum is the: "+sum); // output 204

    // }
    // static int Add(int a, int b){
    //     a = 200;
    //     return a + b ;

    // Other Code for call by value
    int x = 5;
    int sum;
        sum = changeValue(x);
        System.out.println(x); // Output: 5 (unchanged)
        System.out.println(sum);
    }

    static int changeValue(int num) {
        num = 10; // Only changes the copy, not the original
        return num;
    }
}
