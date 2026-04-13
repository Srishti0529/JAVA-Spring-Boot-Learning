package OOPS;

class Student {

    // 🔹 Private variable (data hiding)
    private int marks;

    // 🔹 Getter method
    public int getMarks() {
        return marks;
    }

    // 🔹 Setter method
    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Encapsulation {
     public static void main(String[] args) {

        Student s = new Student();

        // setting value using setter
        s.setMarks(90);

        // getting value using getter
        System.out.println("Marks: " + s.getMarks());
    }
}
