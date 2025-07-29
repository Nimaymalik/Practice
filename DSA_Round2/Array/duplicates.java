package DSA_Round2.Array;

import java.util.HashMap;
import java.util.Map;

public class duplicates {
    public static int duplicateElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                return entry.getKey();

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 };
        System.out.println(duplicateElement(arr));
    }

}
