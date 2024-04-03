import java.util.Scanner;

class Package {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name");

        String Name = myObj.nextLine();

        System.out.println("Heyy!! " + Name);
    }
}
