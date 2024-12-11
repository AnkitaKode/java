import java.util.Arrays;
public class BinarySearch {

    public static void main(String[] args) {

        int a[] = { 10, 20, 15, 22, 35 };

        
        Arrays.sort(a);

        int x = 22;

        int res = Arrays.binarySearch(a, x);

        if (res >= 0)
            System.out.println(x + " found at index = " + res);
        else
            System.out.println(x + " Not found");

        x = 40;
        res = Arrays.binarySearch(a, x);

        if (res >= 0)
            System.out.println(x + " found at index = " + res);
        else
            System.out.println(x + " Not found");
    }
}