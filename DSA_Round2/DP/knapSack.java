package DSA_Round2.DP;

import java.util.Arrays;

public class knapSack {

    // using 1D array space optimization
    public static int knapsack1(int[] values, int[] weights, int W) {
        int[] dp = new int[W + 1]; //W=50 

        for (int i = 0; i < values.length; i++) { // 0-2
            for (int j = W; j >= weights[i]; j--) { // 50 - 10 // 50 -20 // 50 -30  
                dp[W] = Math.max(dp[j], dp[j - weights[i]] + values[i]);  //

            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[W];
    }

    // using 2D array bottom up approach
    public static int knapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }

            }

        }
        System.out.println(Arrays.deepToString(dp));
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] values = { 60, 100, 120 };
        int[] weights = { 10, 20, 30 };
        int capacity = 50;
        // System.out.println(knapsack(values, weights, capacity));
        System.out.println(knapsack1(values, weights, capacity));

    }

}
