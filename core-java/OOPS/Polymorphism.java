package OOPS;
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Polymorphism {
     public static void main(String[] args) {

        // Compile-time polymorphism
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(10, 20));
        System.out.println("Sum: " + calc.add(10, 20, 30));

        // Runtime polymorphism
        Animal obj = new Dog();  // parent reference, child object
        obj.sound();
    }
}
