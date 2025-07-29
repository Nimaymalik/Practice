package DSA_Round2.Array;

public class searchIn2DMatrix {
    public static boolean isPresent(int[][] arr, int target) {

        if (arr.length == 0 || arr == null) {
            return false;
        }
        
        int row = arr.length;
        int col = arr[0].length;

        int i = 0;
        int j = col - 1;
        // binary search
        while (i < row && j >= 0) {
            int curr = arr[i][j];
            if (curr == target) {
                return true;
            } else if (curr > target) {
                j--;
            } else {
                i++;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[][] arr = { { 20, 52, 54 }, { 35, 60, 69 } };
        System.out.println(isPresent(arr, 20));
    }
}