package DSA_Round2.Array;
// Area=(minheight * width) / 2;

public class LargestTrianlgeHistogram {
    // using for loops O(n2) complexity
    // sliding window
    public static double largestTriangleArea(int[] heights) {
        int n = heights.length;// 7
        double maxArea = 0;

        for (int i = 0; i < n; i++) {
            int minHeight = heights[i];
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                int width = j - i + 1;
                double area = (minHeight * width) / 2.0;
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 5, 1, 3, 3 };
        System.out.println(largestTriangleArea(arr));
    }

}
