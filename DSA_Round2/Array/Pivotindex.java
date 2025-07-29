package DSA_Round2.Array;

public class Pivotindex {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };

        int total = 0;
        for (int i : arr) {
            total += i;
        }
        System.out.println(total);
        
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = total - leftsum - arr[i];

            if (leftsum == rightSum) {
                System.out.println(i);
                return;
            }
            leftsum += arr[i];

        }
        System.out.println(-1);
    }

}
