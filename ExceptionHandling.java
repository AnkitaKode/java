class AnnieException extends Exception // created exception by using class i.e not in java
{
    public AnnieException(String string) {
        super(string);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0; // Change to 0 to trigger custom ArithmeticException
        int j = 0;

        try {
            Class.forName("ExceptionHandling");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found.");

        }
        try {
            if (i == 0) {
                // throw new ArithmeticException("I dont want to print zero.");
                throw new AnnieException("I dont want to print zero.");
            }
            j = 18 / i; // Safe division now
        } catch (ArithmeticException e) {
            j = 18 / 1; // Recovery value
            System.out.println("It is the default value. " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong... " + e);
            //e.printStackTrace(); Method hierarchy prints as it is called 
        }


        System.out.println(j);
       
    }
}
