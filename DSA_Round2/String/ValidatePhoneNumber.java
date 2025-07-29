package DSA_Round2.String;

import java.util.Scanner;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the phone Number: ");
        String str = sc.nextLine();

        // ^ start of the string
        // [6-9] starts with 6 to 9
        // \\d means digit
        // {9} means exactly 9
        // $ end if the string

        String regex = "^[6-9]\\d{9}$";
        if (str.matches(regex)) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile Number");
        }

        sc.close();
    }

}
