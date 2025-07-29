package DSA_Round2.String;
// email validation without regex
import java.util.Arrays;
import java.util.Scanner;

public class emailVAlidation {
    public static boolean isValid(String email) {

        if (email == null || email.length() < 10) {
            return false;
        }
        int index = email.indexOf('@');
        if (index <= 0 || index != email.indexOf('@') || index >= email.length() - 1) {
            return false;
        }

        String local = email.substring(0, index);
        String domain = email.substring(index + 1);

        if (local.isEmpty())
            return false;

        int dotIndex = domain.lastIndexOf('.');
        // . should be atleast one time abut not on start or end
        if (dotIndex <= 0 || dotIndex >= domain.length() - 1) {
            return false;

        }
        for (char c : email.toCharArray()) {
            if (c == ' ' || c == '/' || c == '\\' || c == ',') {
                return false;

            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size if the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the emails: ");

        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();

        }
        System.out.println("Email entered are: " + Arrays.toString(arr));

        for (String email : arr) {
            System.out.println(email + "->" + isValid(email));
        }

        sc.close();

    }
}