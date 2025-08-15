public class ExceptionHierarchy {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int nums[] = { 3, 5, 7, 8, 5, 3 };

        String s = null;

        try {
            j = 18 / i; // Arithmetic Error if i=0
            System.out.println(nums[4]);
            System.out.println(nums[6]); // Array Index Out Of Bounds Exception
            System.out.println(s.length());
        }
        // catch (Exception e) {
        // System.out.println("Error in Execution.");
        // }
        catch (ArithmeticException e) {
            System.out.println("Error in Execution.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in limits.");
        } catch (Exception e) {
            System.out.println("Error in Execution.");
        }

        System.out.println(j); // Prints prev value
        System.out.println("okay");
        // System.out.println(s.length());//NullPointer exception

    }
}
