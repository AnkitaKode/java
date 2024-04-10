public class Wrapper {
    public static void main(String[] args) {

        int num = 10;
        Integer num1 = num;

        int num2 = num1;

        System.out.println(num2);

        String str = "18";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 2);

    }
}
