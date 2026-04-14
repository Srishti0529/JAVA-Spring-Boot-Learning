import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args) {

        // create TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add elements
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(10);   // duplicate ignored

        // print TreeSet (sorted automatically)
        System.out.println("TreeSet: " + set);

        // first and last element
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        // higher and lower
        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 30: " + set.lower(30));

        // remove element
        set.remove(50);

        // size
        System.out.println("Size: " + set.size());

        // iterate
        System.out.println("Elements:");
        for(Integer i : set) {
            System.out.println(i);
        }
    }
}
