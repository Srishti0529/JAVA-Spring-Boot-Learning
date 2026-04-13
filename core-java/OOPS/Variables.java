package OOPS;

class Student {

    // 🔹 Instance variable
    String name;

    // 🔹 Static variable
    static String college = "ABC College";

    void display() {

        // 🔹 Local variable
        int age = 21;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}


public class Variables {
     public static void main(String[] args) {

        Student s1 = new Student();

        // assigning value to instance variable
        s1.name = "Srishti";

        // calling method
        s1.display();
    }
}
