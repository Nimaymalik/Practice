package DSA_Round2.String;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    // return that string in which there is only one character difference 
    public static List<String> result(String[] arr, String str) {
        List<String> list=new ArrayList<>();

        for (String s : arr) { // finding the equal length pairs
            if (s.length() == str.length()) { // check the difference
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (str.charAt(i) != s.charAt(i)) {
                        count++;
                    }
                }
                if (count == 1) {
                    list.add(s);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = { "bana", "apple", "banada", "bonanzo", "banans" };
        String str = "banana";
        System.out.println(result(arr, str));
    }
}