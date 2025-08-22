public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // String reversed = new StringBuilder(str).reverse().toString();
        // System.out.println(reversed); Short method

        String reversed = reverse(str);
        System.out.println(reversed);
    }

    public static String reverse(String input) {
        if (input == null)
            return null;
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}