package basics;

public class Loops {
      public static void main(String[] args) {

        // 🔹 for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("For Loop: " + i);
        }

        // 🔹 while loop
        int i = 1;
        while (i <= 3) {
            System.out.println("While Loop: " + i);
            i++;
        }

        // 🔹 do-while loop
        int j = 1;
        do {
            System.out.println("Do-While Loop: " + j);
            j++;
        } while (j <= 3);

        // 🔹 for-each loop
        int[] arr = {1, 2, 3};
        for (int num : arr) {
            System.out.println("For-Each Loop: " + num);
        }

        // 🔹 break statement
        for (int k = 1; k <= 5; k++) {
            if (k == 3) break;
            System.out.println("Break Loop: " + k);
        }

        // 🔹 continue statement
        for (int k = 1; k <= 5; k++) {
            if (k == 3) continue;
            System.out.println("Continue Loop: " + k);
        }
    }
}
