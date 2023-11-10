package org.example.basic;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String str1 = "aab",
        str2 = "xxy";
        System.out.println(areIsomorphic(str1, str2));
    }

    static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        HashMap<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (charMap.containsKey(char1)) {
                if (charMap.get(char1) != char2) return false;
            } else {
                if (charMap.containsValue(char2)) return false;
                charMap.put(char1, char2);
            }
        }

        return true;
    }
}
