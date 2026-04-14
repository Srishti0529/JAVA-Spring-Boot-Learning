

public class ExceptionHandeling {
     public static void main(String[] args) {

        try {
            // calling method
            checkAge(15);

            // risky code
            int a = 10;
            int b = 0;

            int result = a / b;   // ArithmeticException
            System.out.println(result);
        }

        // using Throwable class (parent of all exceptions)
        catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }

        // finally block always executes
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }


    // method using throw keyword
    static void checkAge(int age) {

        if (age < 18) {

            // manually throwing exception
            throw new ArithmeticException("Age must be 18 or above");
        }

        System.out.println("Valid age");
    }
}

