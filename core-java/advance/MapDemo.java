import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
     public static void main(String[] args) {

        // ---------------- HashMap ----------------
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(3, "Java");
        hashMap.put(1, "Python");
        hashMap.put(2, "C++");
        hashMap.put(1, "Updated"); // duplicate key replaces value

        System.out.println("HashMap: " + hashMap);



        // ---------------- LinkedHashMap ----------------
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put(3, "Java");
        linkedMap.put(1, "Python");
        linkedMap.put(2, "C++");

        // maintains insertion order
        System.out.println("LinkedHashMap: " + linkedMap);



        // ---------------- TreeMap ----------------
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "Java");
        treeMap.put(1, "Python");
        treeMap.put(2, "C++");

        // sorted by keys
        System.out.println("TreeMap: " + treeMap);
    }
}
