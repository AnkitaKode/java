public class Wideningcasting   // Smaller to Larger size type
{
    public static void main(String[] args) {
        int myInt = 6;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt); // Outputs 6
        System.out.println(myDouble); // Outputs 6.0
    }
}