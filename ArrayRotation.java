import java.util.Arrays;

public class ArrayRotation {

    static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        d %= n;

        int[] temp = new int[n];

        for (int i = 0; i < n - d; i++)
            temp[i] = arr[d + i];

        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5,6,7,8 };
        int d = 3;

        rotateArr(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}