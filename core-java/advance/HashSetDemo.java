import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        // create HashSet
        HashSet<String> set = new HashSet<>();

        // add elements
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");   // duplicate ignored
        set.add(null);     // only one null allowed

        // print HashSet
        System.out.println("HashSet: " + set);

        // check element
        System.out.println("Contains Java: " + set.contains("Java"));

        // remove element
        set.remove("Python");

        // size
        System.out.println("Size: " + set.size());

        // iterate HashSet
        System.out.println("Elements:");
        for(String s : set) {
            System.out.println(s);
        }
    }
}
