public class InsideClassess {
     static class Test{ // we can't use the non-static variables on a obj that will be  not run 
        String name;
        public Test(String name){
            this.name = name;
        }
    }
        public static void main(String[] args) {
            Test obj1 = new Test("Shiva");
            Test obj2 = new Test("Riyaz");
            System.out.println(obj1.name);
            System.out.println(obj2.name);
        }
}
// we can't create the static methods outside the classess 