import java.util.Scanner;

public class InputHandler {
    static void IOFunction() {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            float b = sc.nextFloat();
            long c = sc.nextLong();
            byte d = sc.nextByte();
            sc.nextLine();
            
            String s = sc.nextLine();

            System.out.println("Enter Integer: " + a);
            System.out.println("Enter Float: " + b);
            System.out.println("Enter Long: " + c);
            System.out.println("Enter Byte: " + d);
            System.out.println("Enter String: " + s);
        }

        sc.close();
    }

    public static void main(String[] args) {
        IOFunction();
    }
}
