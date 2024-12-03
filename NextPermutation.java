public class nextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        
        nextPermutation solution = new nextPermutation();
        solution.nextPermutation(arr);

        System.out.print("Next Permutation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    void nextPermutation(int[] arr) {
        int n = arr.length;

        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Swap using a temporary variable for clarity
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        reverse(arr, i + 1, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap using a temporary variable for clarity
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
