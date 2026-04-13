package intermediate;

public class Array {
     public static void main(String[] args) {

        // 🔹 Declaration + Initialization
        int[] arr = {10, 20, 30, 40, 50};

        // 🔹 Accessing elements
        System.out.println("First Element: " + arr[0]);
        System.out.println("Second Element: " + arr[1]);

        // 🔹 Traversing array using loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // 🔹 Using for-each loop
        for (int num : arr) {
            System.out.println("Value: " + num);
        }
    }
}
