package OOPS;

interface Animal {

    // abstract method (by default public and abstract)
    void sound();
}


// implementing interface
class Dog implements Animal {

    // providing implementation of interface method
    public void sound() {
        System.out.println("Dog barks");
    }
}


// another class implementing same interface
class Cat implements Animal {

    // providing implementation
    public void sound() {
        System.out.println("Cat meows");
    }
}


public class Interfaces {
     public static void main(String[] args) {

        // interface reference (upcasting)
        Animal a1 = new Dog();
        a1.sound();

        Animal a2 = new Cat();
        a2.sound();
    }
}
