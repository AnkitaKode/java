import java.util.Scanner;

public class input {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String myName = scan.next();

        System.out.println("Enter your age:");
        int myAge = scan.nextInt();

        System.out.println("Heyy " + myName + ", you are " + myAge + " years old.");
    }
}