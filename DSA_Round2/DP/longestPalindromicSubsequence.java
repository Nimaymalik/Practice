package DSA_Round2.DP;

import java.util.Arrays;

public class longestPalindromicSubsequence {
    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[] dp = new int[n];

        // filling from top to bottom
        for (int i = n - 1; i >= 0; i--) {
            // single char is always palindrome
            dp[i] = 1;
            int prev = 0;
            for (int j = i + 1; j < n; j++) {
                int temp = dp[j];
                if (s.charAt(i) == s.charAt(j)) {
                    dp[j] = prev + 2;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                prev = temp;

            }

        }
        System.out.println(Arrays.toString(dp));

        return dp[n - 1];

    }

    public static void main(String[] args) {
        String str = "bbbab";
        System.out.println(longestPalindromeSubseq(str));

    }

}
