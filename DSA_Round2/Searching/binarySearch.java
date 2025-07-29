package DSA_Round2.Searching;

public class binarySearch {
    public static int Search(int[] arr, int target) {
        // we have to give the index of the target element

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;

            } else {
                left = mid + 1;

            }

        }
        return -1;// not found

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = -1;
        System.out.println(Search(arr, target));

    }

}
