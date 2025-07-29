import java.util.Arrays;
import java.util.Stack;

public class MaxDonation {
    // bruth-force approach with loops
    public static int maxDonation(int[] arr) {
        int maxTotal = 0;

        // try every subarray
        for (int i = 0; i < arr.length; i++) {
            int minVal = arr[i];
            for (int j = i; j < arr.length; j++) {
                minVal = Math.min(minVal, arr[j]);
                int len = j - i + 1;
                int total = minVal * len;
                maxTotal = Math.max(maxTotal, total);

            }

        }
        return maxTotal;

    }

    // Using Monotonic Stack
    public static int maxDonationMonotonic(int[] arr) {
        int n = arr.length;

        // adding 0 in start and end to avoid emptystackexception
        int[] newArr = new int[n + 2];
        newArr[0] = 0;
        for (int i = 0; i < n; i++) {
            newArr[i + 1] = arr[i];

        }
        newArr[n + 1] = 0;
        System.out.println("New array is :" + Arrays.toString(newArr));

        Stack<Integer> stack = new Stack<>();
        int maxTotal = 0;

        for (int i = 0; i < newArr.length; i++) {
            while (!stack.isEmpty() && newArr[i] < newArr[stack.peek()]) {
                int index = stack.pop();
                int height = newArr[index];
                int width = i - stack.peek() - 1;
                maxTotal = Math.max(maxTotal, height * width);

            }
            stack.push(i);

        }
        return maxTotal;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 2, 1 };
        // int n = 5; // no of element in array
        // System.out.println(maxDonation(arr));
        System.out.println(maxDonationMonotonic(arr));

    }

}
