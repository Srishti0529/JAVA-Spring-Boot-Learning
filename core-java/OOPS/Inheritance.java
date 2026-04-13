package OOPS;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
     public static void main(String[] args) {

        Dog d = new Dog();

        // calling parent class method
        d.sound();

        // calling child class method
        d.bark();
    }
}
