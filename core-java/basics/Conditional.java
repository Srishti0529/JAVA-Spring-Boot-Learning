package basics;

public class Conditional {
    public static void main(String[] args) {

        int number = 10;

        // if-else condition
        if (number > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }

        // if-else if ladder
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // switch statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
