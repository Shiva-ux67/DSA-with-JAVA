public class OverLoding {
    public static void main(String[] args) {
        calculate(2,4);

    }
    static void calculate(int a, int b){
        System.out.println(a + b);
    }
    static void calculate(){
        System.out.println();
    }

}
