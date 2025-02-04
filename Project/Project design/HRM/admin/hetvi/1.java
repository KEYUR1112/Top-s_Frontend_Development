import java.util.Arrays;

public class RearrangeArray {
    public static int[] rearrange(int[] input) {
        int n = input.length / 2; // Assume the input length is always even

        // Create arrays for the two parts
        int[] xArray = new int[n];
        int[] yArray = new int[n];

        // Split the input into xArray and yArray
        for (int i = 0; i < n; i++) {
            xArray[i] = input[2 * i];     // Take every x element
            yArray[i] = input[2 * i + 1]; // Take every y element
        }

        // Combine xArray and yArray into the result array
        int[] result = new int[input.length];
        System.arraycopy(xArray, 0, result, 0, n);
        System.arraycopy(yArray, 0, result, n, n);

        return result;
    }

    public static void main(String[] args) {
        // Example input array
        int[] input = {1, 4, 2, 5, 3, 6};

        // Rearrange the array
        int[] rearrangedArray = rearrange(input);

        // Print the result
        System.out.println("Rearranged Array: " + Arrays.toString(rearrangedArray));
    }
}
