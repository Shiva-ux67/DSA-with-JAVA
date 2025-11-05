// package OPPs;

// public class Message {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
    
//     }

//     public static void greetings(){
//         System.out.println("How to simple way to learn java");
//     }
// }
public class Message{
    public static void main(String[] args) {
        CSE Student1 = new CSE();
        Student1.setName("Shiva Prasad");
        System.out.println(Student1.name);
    }
}
class CSE{
    int rollno;
    String name;
    public void setName(String n){
        this.name = n;
    }
}
