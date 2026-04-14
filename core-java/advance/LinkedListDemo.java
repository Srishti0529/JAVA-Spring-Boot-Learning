import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // add at first
        list.addFirst("C");

        // add at last
        list.addLast("JavaScript");

        // print list
        System.out.println("LinkedList: " + list);

        // get element
        System.out.println("First Element: " + list.getFirst());

        // remove element
        list.remove("Python");

        // remove first
        list.removeFirst();

        // size
        System.out.println("Size: " + list.size());

        // iterate
        System.out.println("Elements:");
        for(String s : list) {
            System.out.println(s);
        }
    }
}
