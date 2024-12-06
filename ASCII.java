public class ASCII {
    public static void main(String[] args) {
        char ch = 'u';
        int ascii = ch;

        System.out.println("The ASCII value of character '" + ch + "' is: " + ascii);

        int castAscii = (int)ch;

        System.out.println("The ASCII value of character '" + ch + "' is: " + castAscii);
    }
}
