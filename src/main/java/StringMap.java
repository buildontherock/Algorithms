package main.java;

import java.util.HashMap;


public class StringMap {

    private HashMap<String, Integer> integerStrings = new HashMap<>();


    public HashMap<String, Integer> getIntegerStrings() {
        integerStrings.put("one", 1);
        integerStrings.put("two", 2);
        integerStrings.put("three", 3);
        integerStrings.put("four", 4);
        integerStrings.put("five", 5);
        integerStrings.put("six", 6);
        integerStrings.put("seven", 7);
        integerStrings.put("eight", 8);
        integerStrings.put("nine", 9);
        integerStrings.put("ten", 10);
        integerStrings.put("twenty", 20);
        integerStrings.put("thirty", 30);
        integerStrings.put("forty", 40);
        integerStrings.put("fifty", 50);
        integerStrings.put("sixty", 60);
        integerStrings.put("seventy", 70);
        integerStrings.put("eighty", 80);
        integerStrings.put("ninety", 90);

        return integerStrings;
    }
}
