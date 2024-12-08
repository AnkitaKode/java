 public class m {

    
    public static int linearSearch(int[] arr, int target) {
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Return -1 if the target is not found
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int target = 33;

        // Perform linear search
        int result = linearSearch(numbers, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
