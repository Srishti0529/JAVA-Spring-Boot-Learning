package basics;

public class type_casting_conversion {
    public static void main (String args[]){
     // 🔹 Type Conversion (Widening - Automatic)
        int a = 10;
        double b = a;   // int → double

        System.out.println("Type Conversion (int to double): " + b);

        // 🔹 Type Casting (Narrowing - Manual)
        double x = 10.75;
        int y = (int) x;   // double → int

        System.out.println("Type Casting (double to int): " + y);
    }
}
