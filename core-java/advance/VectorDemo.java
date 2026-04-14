import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        // create Vector
        Vector<String> v = new Vector<>();

        // add elements
        v.add("Java");
        v.add("Python");
        v.add("C++");
        v.add("Java");   // duplicates allowed

        // print vector
        System.out.println("Vector: " + v);

        // get element
        System.out.println("Element at index 1: " + v.get(1));

        // first and last element
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());

        // size
        System.out.println("Size: " + v.size());

        // remove element
        v.remove("Python");

        // iterate vector
        System.out.println("Elements:");
        for(String s : v) {
            System.out.println(s);
        }
    }
}
