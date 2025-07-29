// In abstract method only necessary details are displayed to the user 
package DSA_Round2.OOPs;

// Example in which the user only kn ow how to start the car accelerate and brake
abstract class Vehicle {
    abstract void accelerate();

    abstract void brake();

    void engine() {
        System.out.println("Engine started");
    }

}

class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car accelerate");
    }

    @Override
    void brake() {
        System.out.println("Car brake");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle mycar = new Car();
        mycar.engine();
        mycar.accelerate();
        mycar.brake();
    }

}