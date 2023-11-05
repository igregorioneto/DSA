package org.example.basic;

import java.util.HashSet;
import java.util.Set;

public class SortTheFest {
    public static void main(String[] args) {
        String[] s = {"cake", "pastry", "fish", "candy", "meat"},
                t = {"burger", "ham", "fish", "cake", "sauce"};
        System.out.println(isCommon(s, t));
    }

    static String isCommon(String [] s, String [] t) {
        Set<String> arr = new HashSet<>();
        for (String word:s) {
            arr.add(word);
        }

        for (String word:t) {
            if (arr.contains(word)) {
                return "CHANGE";
            }
        }

        return "BEHAPPY";
    }

    static String isCommon2(String [] s, String [] t) {
        String result = "BEHAPPY";
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (s[i] == t[j]) {
                    result = "CHANGE";
                    break;
                }
            }
            if (result.equals("CHANGE")) break;
        }
        return result;
    }
}
