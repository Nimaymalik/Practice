package DSA_Round2.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class InnertopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // adding the array element to count the frequency
        for (int items : nums) {
            map.put(items, map.getOrDefault(items, 0) + 1);
        }

        // creating the min heap and placing the min frequency elements at the top
        // now checking the top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(entry);

            // if heap has more than k elements then remove smallest frequency
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // adding the top k elements into array
        while (!heap.isEmpty()) {
            arr[index] = heap.poll().getKey();
            index++;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));

    }
}
