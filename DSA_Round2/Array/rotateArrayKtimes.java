package DSA_Round2.Array;

import java.util.Arrays;

public class rotateArrayKtimes {

    public static void rotateRight(int[] arr, int k) {
        if (arr.length < 1) {
            System.out.println("Empty array");
            return;
        }
        k = k % arr.length;
        rotate(arr, 0, arr.length - 1); // full rotation
        rotate(arr, 0, k - 1); // till k-1
        rotate(arr, k, arr.length - 1); // k till last

        System.out.println(Arrays.toString(arr));

    }

    public static void rotateLeft(int[] arr, int k) {
        if (arr.length < 1) {
            System.out.println("Empty array");
            return;
        }
        k = k % arr.length; // to handle if k>n
        rotate(arr, 0, k - 1); // till k-1
        rotate(arr, k, arr.length - 1); // then form k till last index
        rotate(arr, 0, arr.length - 1); // rotation till k

        System.out.println(Arrays.toString(arr));

    }

    public static int[] rotate(int[] arr, int first, int last) {
        int start = first;
        int end = last;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // rotateRight(arr, 3);
        rotateLeft(arr, 1);

    }

}
