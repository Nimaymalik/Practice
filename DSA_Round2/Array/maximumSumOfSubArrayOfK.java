package DSA_Round2.Array;

public class maximumSumOfSubArrayOfK {
    public static int minSum(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }

        int minSum = 0;
        for (int i = 0; i < k; i++) {
            minSum += arr[i];
        }

        int windowMin = minSum;
        for (int i = k; i < arr.length; i++) {
            windowMin += arr[i] - arr[i - k];
            minSum = Math.min(windowMin, minSum);

        }
        return minSum;
    }

    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1;
        }
        int maxSum = 0;
        // count first 4
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int currWindow = maxSum;
        for (int i = k; i < n; i++) {
            currWindow += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currWindow);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        System.out.println(maxSum(arr, 4));// maximum array with window size of k
        System.out.println(minSum(arr, 4));// minimum array with window size k

    }
}