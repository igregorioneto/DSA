package org.example.basic;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {
    public static void main(String[] args) {
        String S = "bc";
        System.out.println(firstRep(S));
    }

    static char firstRep(String S) {
        char[] arr = S.toCharArray();
        char c = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c = arr[i];
                    count++;
                    break;
                }
            }
            if (count > 0) break;
        }
        if (count == 0) return '#';

        return c;
    }
}
