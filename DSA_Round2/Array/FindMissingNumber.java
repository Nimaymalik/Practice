package DSA_Round2.Array;

public class FindMissingNumber {
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int total = 0;
        int n = arr.length + 1;
        int miss = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Missing number is " + (miss - total));
    }

}
