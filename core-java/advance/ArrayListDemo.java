import java.util.*;
public class ArrayListDemo {
     public static void main(String[] args) {

        // create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");   // duplicate allowed

        // print list
        System.out.println("ArrayList: " + list);

        // get element using index
        System.out.println("Element at index 1: " + list.get(1));

        // update element
        list.set(2, "C");

        // remove element
        list.remove(0);

        // size of list
        System.out.println("Size: " + list.size());

        // iterate using loop
        System.out.println("Elements:");
        for(String s : list) {
            System.out.println(s);
        }
    }
}
