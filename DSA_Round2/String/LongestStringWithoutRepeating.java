package DSA_Round2.String;

import java.util.HashSet;

// sliding window and hashset 
public class LongestStringWithoutRepeating {
    public static int calculateLength(String str) {
        int n = str.length();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        // we are using 2 ponter to check and remove the duplicates

        HashSet<Character> set = new HashSet<>();
        while (right < n) {
            // checking of the char is present or not
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;

            } else {
                // if not present than add
                set.remove(str.charAt(left));
                left++;
            }

        }
        return maxLength;

    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(calculateLength(str));

    }

}
