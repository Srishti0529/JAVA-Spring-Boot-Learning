import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Student class
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Java"));
        list.add(new Student(1, "Python"));
        list.add(new Student(2, "C++"));

        // Comparator for sorting by id
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.id - s2.id;
            }
        };

        // sorting using comparator
        Collections.sort(list, comp);

        // printing
        for(Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    } 
}
