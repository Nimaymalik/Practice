package DSA_Round2.Array;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String first = "namanc";
        String second = "manabn";

        if (first.length() != second.length()) {
            System.out.println("Not anagram");
        }

        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("No anagram");
                return;
            }

        }
        System.out.println("Anagram string");
    }

}
