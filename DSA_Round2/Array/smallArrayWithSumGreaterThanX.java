package DSA_Round2.Array;

public class smallArrayWithSumGreaterThanX {
    public static int smallestSubWithSum(int[] arr, int x) {

        int n = arr.length;
        int start = 0;
        int end = 0;
        int currSum = 0;
        int minLen = n + 1;

        while (end < n) {
            // keep adding until sum is > x
            while (currSum <= x && end < n) {
                currSum += arr[end];
                end++;
            }
            // trying to minimize the window
            while (currSum > x && start < n) {
                minLen = Math.min(minLen, end - start);

                currSum -= arr[start];
                start++;
            }
        }
        return (minLen == n + 1) ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 0, 19 };
        System.out.println(smallestSubWithSum(arr, 51));

    }
}