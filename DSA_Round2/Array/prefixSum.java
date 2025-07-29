package DSA_Round2.Array;

public class prefixSum {
    public static int prefix(int[] arr, int index) {
        if (arr.length == 0) {
            return -1;

        }

        // calculation the sum of the previous index inplace
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr[index - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(prefix(arr, 2));

    }

}
