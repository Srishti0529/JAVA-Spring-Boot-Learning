package OOPS;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog makes sound");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Typecasting {
    public static void main(String[] args) {

        // 🔹 UPCASTING
        Animal a = new Dog();   // Parent reference, Child object

        a.sound();  // calls Dog's overridden method

        // a.bark();  Not allowed (parent reference)

        // 🔹 DOWNCASTING
        Dog d = (Dog) a;  // converting back to child

        d.sound();  // Dog method
        d.bark();   // now accessible
    }
}
