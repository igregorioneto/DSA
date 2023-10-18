package org.example.basic;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAStringIsIsogramOrNot {
    public static void main(String[] args) {
        String S = "geeks";
        System.out.println(isIsogram(S));
    }

    static boolean isIsogram(String data) {
        Map<String, Integer> arr = new HashMap<>();
        for (char c:data.toCharArray()) {
            String chave = String.valueOf(c);
            if (arr.containsKey(chave)) {
                arr.put(chave, arr.get(chave) + 1);
            } else {
                arr.put(chave, 1);
            }
        }

        for (Map.Entry<String, Integer> entry:arr.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }
        }

        return true;
    }
}
