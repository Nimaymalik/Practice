package DSA_Round2.String;

import java.util.Arrays;
import java.util.Scanner;

public class FakePhnNumber {

    public static boolean isValid(String number) {
        if (number == null || number.length() < 10) {
            return false;
        }

        String phnnumber = number.trim();
        String checkdigit = "";

        // Check format
        if (phnnumber.startsWith("+91")) {
            if (phnnumber.length() != 14 || phnnumber.charAt(3) != ' ')
                return false;
            checkdigit = phnnumber.substring(4).replace(" ", "");
        } else if (phnnumber.startsWith("0")) {
            if (phnnumber.length() != 11 || phnnumber.charAt(5) != ' ')
                return false;
            checkdigit = phnnumber.substring(1).replace(" ", "");
        } else {
            return false;
        }

        // Check digit count
        if (checkdigit.length() != 10) {
            return false;
        }

        // Check valid start digit
        char firstdigit = checkdigit.charAt(0);
        if (firstdigit != '7' && firstdigit != '8' && firstdigit != '9') {
            return false;
        }

        // Ensure all are digits
        for (char c : checkdigit.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;w
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter the phone numbers:");
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Phone numbers entered are: " + Arrays.toString(arr));

        for (String phone : arr) {
            System.out.println(phone + " -> " + isValid(phone));
        }

        sc.close();
    }
}
