import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // create LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add elements
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");   // duplicate ignored
        set.add("HTML");

        // maintains insertion order
        System.out.println("LinkedHashSet: " + set);

        // check element
        System.out.println("Contains Python: " + set.contains("Python"));

        // remove element
        set.remove("C++");

        // size
        System.out.println("Size: " + set.size());

        // iterate
        System.out.println("Elements:");
        for(String s : set) {
            System.out.println(s);
        }
    }
}
