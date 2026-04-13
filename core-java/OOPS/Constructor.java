package OOPS;

class Student {

    String name;
    int age;

    // 🔹 Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // 🔹 Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
     public static void main(String[] args) {

        // using default constructor
        Student s1 = new Student();
        s1.display();

        // using parameterized constructor
        Student s2 = new Student("Srishti", 21);
        s2.display();
    }
}
