package DSA_Round2.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinFromTopToBottom {

    public static int getMinSum(List<List<Integer>> triangle) {

        int n = triangle.size();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            // copy the last row into arr
            arr[i] = triangle.get(n - 1).get(i);

        }
        // update arr from second largest to top
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                arr[j] = triangle.get(i).get(j) + Math.min(arr[j + 1], arr[j]);
            }

        }
        return arr[0];

    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        int result = getMinSum(triangle);
        System.out.println("Minimum path sum: " + result);

    }

}
