package DSA_Round2.Array;

import java.util.Arrays;

public class FizzBuzz {
    public static String[] fizzbuzz(int n) {
        String[] arr = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            } else {
                arr[i - 1] = Integer.toString(i);
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzbuzz(15)));
    }
}
