// Using BFS
package DSA_Round2.DFSBFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BusRoutes {
    public static int sourceToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }

        Map<Integer, List<Integer>> stopTobus = new HashMap<>();
        // traversing the array and check the element in present in which array
        // output of the stopToBus is {1=[0], 2=[0], 3=[1], 6=[1], 7=[0, 1]}
        for (int i = 0; i < routes.length; i++) {
            for (int stop : routes[i]) {
                stopTobus.computeIfAbsent(stop, _ -> new ArrayList<>()).add(i);

            }
        }
        System.out.println("stop buses " + stopTobus);

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visitedStops = new HashSet<>();
        Set<Integer> visitedBus = new HashSet<>();

        // adding source to queue and visitedStops
        queue.offer(source);
        visitedStops.add(source);
        System.out.println("Queue is " + queue + " " + "Visited Stops is " + visitedStops);

        int busesTaken = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            busesTaken++;

            for (int i = 0; i < size; i++) {
                int currentStop = queue.poll(); // giving the starting element of the queue
                System.out.println("Current stop " + currentStop);

                List<Integer> buses = stopTobus.getOrDefault(currentStop, new ArrayList<>());
                for (int bus : buses) {
                    if (visitedBus.contains(bus)) {
                        continue;
                    }
                    visitedBus.add(bus);
                    for (int stop : routes[bus]) {
                        if (stop == target) {
                            return busesTaken;
                        }
                        if (!visitedStops.contains(stop)) {
                            visitedStops.add(stop);
                            queue.offer(stop);
                        }
                    }
                    System.out.println("Buses " + buses);
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 7 }, { 3, 6, 7 } };
        System.out.println(sourceToDestination(arr, 1, 6));

    }

}
