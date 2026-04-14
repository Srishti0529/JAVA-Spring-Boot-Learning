
import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        System.out.println("Input a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Number is :" + num);
    }
}
