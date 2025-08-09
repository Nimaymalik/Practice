package DSA_Round2;

import java.util.HashMap;
import java.util.Map;

public class integerToRoman {
    public static void integer(String str) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        map.put("sixty", 60);
        map.put("seventy", 70);
        map.put("eighty", 80);
        map.put("ninety", 90);
        map.put("hundred", 100);
        map.put("thousand", 1000);

        String[] word = str.toLowerCase().split(" ");
        int total = 0;
        int current = 0;

        for(String w:word){
            if(!map.containsKey(w)){
                System.out.println(word);
                return;
            }
            int value=map.get(w);
            if(value == 100){
                current*=100;
            }else if(value == 1000){
                current*=1000;
                total+=current;
                current=0;
            }else{
                current+=value;
            }
        }
        total+=current;
        System.out.println(total);

    }

    public static void main(String[] args) {
        String str = "Three hundred thousand";
        integer(str);

    }
}