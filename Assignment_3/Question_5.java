import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push elements from the array onto the stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop elements from the stack and put them back into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        reverseArray(array);

        System.out.println("\nReversed Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

