package OOPS;

class Calculator {

    // method 1
    int add(int a, int b) {
        return a + b;
    }

    // method 2 (different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}


public class MethodOverloading {
     public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));
    }
}
