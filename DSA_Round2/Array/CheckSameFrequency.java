package DSA_Round2.Array;

import java.util.HashMap;
import java.util.Map;

public class CheckSameFrequency {
    public static boolean check(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i : arr1) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }
        for (int i : arr2) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 };
        int[] arr1 = { 2, 2, 2, 2 };

        System.out.println(check(arr, arr1));

    }

}
