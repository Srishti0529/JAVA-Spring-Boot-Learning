package OOPS;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}
