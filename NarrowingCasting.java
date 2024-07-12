public class NarrowingCasting // Larger to Smaller size type
{
    public static void main(String[] args) {
        double myDouble = 6.58d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // Outputs 6.58
        System.out.println(myInt); // Outputs 6
    }
}