package Code_Snipper;

import java.util.Arrays;
import java.util.Stack;

public class STACK {

    public static int[] prevGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize result array with -1
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int smallerIndex = stack.pop();
                result[smallerIndex] = i;
            }
            stack.push(i);
        }

        return result;
    }

    public static int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize result array with -1
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int greaterIndex = stack.pop();
                result[greaterIndex] = i;
            }
            stack.push(i);
        }

        return result;
    }
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize result array with -1
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int smallerIndex = stack.pop();
                result[smallerIndex] = i;
            }
            stack.push(i);
        }

        return result;
    }
}
