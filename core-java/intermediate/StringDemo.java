package intermediate;

public class StringDemo {
      public static void main(String[] args) {

        // 🔹 Creating Strings
        String str1 = "Hello";
        String str2 = "World";

        // 🔹 Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // 🔹 Length
        System.out.println("Length: " + result.length());

        // 🔹 Character at index
        System.out.println("Char at index 1: " + result.charAt(1));

        // 🔹 Convert case
        System.out.println("Uppercase: " + result.toUpperCase());
        System.out.println("Lowercase: " + result.toLowerCase());

        // 🔹 Comparison
        String str3 = "Hello";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Using == : " + (str1 == str3));

        // 🔹 Substring
        System.out.println("Substring: " + result.substring(0, 5));
    }
}
