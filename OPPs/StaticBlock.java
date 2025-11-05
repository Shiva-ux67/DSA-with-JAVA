public class StaticBlock {
    static int a = 2;
    static int b;

    // will only run once, when the first obj is create.  
    static{
        System.out.println("I am in inside the static block..!");
        b = a * 6;

    }
    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
        StaticBlock.b += 6;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
    }
}
