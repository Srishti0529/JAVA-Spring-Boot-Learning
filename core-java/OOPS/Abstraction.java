package OOPS;

abstract class Vehicle {

    // abstract method (no body)
    // child class must implement this
    abstract void start();

    // normal method
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

// Child class 1
class Car extends Vehicle {

    // providing implementation
    void start() {
        System.out.println("Car starts with key");
    }
}

// Child class 2
class Bike extends Vehicle {

    // providing implementation
    void start() {
        System.out.println("Bike starts with self button");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        // upcasting (parent reference)
        Vehicle v1 = new Car();
        v1.start();   // calls Car start()
        v1.fuel();

        System.out.println();

        Vehicle v2 = new Bike();
        v2.start();   // calls Bike start()
        v2.fuel();
    }
}
