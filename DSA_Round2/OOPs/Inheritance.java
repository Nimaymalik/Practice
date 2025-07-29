package DSA_Round2.OOPs;

// Inheritance is the propertu=y in which one calss is allowed to inherit the feature of another class 
class Animal {
    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();

    }

}
