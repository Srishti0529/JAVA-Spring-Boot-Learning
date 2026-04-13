package OOPS;

class Demo {

    // 🔹 Private variable
    private int privateVar = 10;

    // 🔹 Default variable
    int defaultVar = 20;

    // 🔹 Protected variable
    protected int protectedVar = 30;

    // 🔹 Public variable
    public int publicVar = 40;

    void display() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
public class AccessSpecifier {
    public static void main(String[] args) {

        Demo obj = new Demo();

        // Accessing variables
        // privateVar is NOT accessible directly outside class

        System.out.println("Default: " + obj.defaultVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Public: " + obj.publicVar);

        // Accessing private variable using method
        obj.display();
    }
}
