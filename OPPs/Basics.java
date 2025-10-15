package OPPs;

public class Basics {
    public static void main(String[] args) {
        Student shiva = new Student();
        Student ria = new Student();
        // shiva.roll = 23;
        // shiva.name = "Shiva Prasad";
        // shiva.marks = 87.4f;
        shiva.greetings();

        // System.out.println(shiva.roll);
        // System.out.println(shiva.name);
        // System.out.println(shiva.marks);

    }
}
// create an class
// for every single student 
        class Student{
            int roll;
            String name;
            float marks;
            void greetings(){
                System.out.println("Hello ! myv name is :"+name);
            }
            Student (){
                this.roll = 23;
                this.name = "Shiva Prasad";
                this.marks = 87.4f;
            }
        }

