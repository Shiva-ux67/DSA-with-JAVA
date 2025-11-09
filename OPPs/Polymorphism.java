public class Polymorphism{
    public static void main(String[] args) {
        Dog ani = new Dog();
        ani.speak("Hello");//
    }}
    class Animal{
        void speak(String s){ // Over Loading : Same name, different parameters (compile time)

//  When two or more methods have same name but different number or types of parameters,
// it is called method overloading.
// It happens in the same class.
            System.out.println("this is the animal speaking ! : " +  s);
        }
    }
    class Dog extends Animal{
        void speak(){
//             Same name, same parameters (run time)

//  When a child class gives its own implementation of a method already present in parent class,
// it is called method overriding.
// It happens in inheritance (parent–child relation).
            System.out.println("BOEWW!!");
        }
    }
    class Cat extends Animal{
        void speak(){
            System.out.println("MEOWWW !");
        }

    }
