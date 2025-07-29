package DSA_Round2.Array;

public class CountZeroInMatrix {
    public static int countZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0, 0 }, { 1, 0, 0, 0 }, { 1, 1, 1, 0 } };
        
        int max = 0;
        int countRow = -1;

        for (int i = 0; i < arr.length; i++) {
            int result = countZero(arr[i]);
            if (result > max) {
                max = result;
                countRow = i;
            }

        }
        System.out.println("Maximum number of Zero are: " + max + " which is in row: " + countRow);
    }

}
