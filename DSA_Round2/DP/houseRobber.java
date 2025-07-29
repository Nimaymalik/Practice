package DSA_Round2.DP;

public class houseRobber {
    public static int rob(int[] arr) {
        if (arr.length == 0)
            return 0;

        if (arr.length == 1)
            return arr[0];

        int max1 = 0;
        int max2 = 0;
        for (int i : arr) {
            int temp = max1;
            max1 = Math.max(max1, max2 + i);
            max2 = temp;

        }
        return max1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1 };
        System.out.println(rob(arr));

    }

}
