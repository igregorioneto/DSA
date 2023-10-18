package org.example.basic;

import java.util.Arrays;

public class UncommonCharacters {
    public static void main(String[] args) {
        String A = "geeks", B = "geeks";
        System.out.print(uncommonChars(A, B));
    }

    static String uncommonChars(String A, String B) {
        String uncommon = "";
        for (int i = 0; i < A.length(); i++) {
            String key = String.valueOf(A.charAt(i));
            if (!B.contains(key) && !uncommon.contains(key)) uncommon += key;
        }
        for (int i = 0; i < B.length(); i++) {
            String key = String.valueOf(B.charAt(i));
            if (!A.contains(key) && !uncommon.contains(key)) uncommon += key;
        }
        if (uncommon.length() > 0) {
            char[] arr = uncommon.toCharArray();
            Arrays.sort(arr);
            uncommon = "";
            for (int i = 0; i < arr.length; i++) {
                uncommon += arr[i];
            }
        } else {
            uncommon = "-1";
        }

        return uncommon;
    }
}
