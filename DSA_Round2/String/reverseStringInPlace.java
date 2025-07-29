package DSA_Round2.String;

public class reverseStringInPlace {
    public static void InPlaceReverse(String str) {
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        System.out.println(arr);

    }

    public static void main(String[] args) {
        String str = "Nimay";
        InPlaceReverse(str);

    }
}