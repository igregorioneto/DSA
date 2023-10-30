package org.example.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoodOrBadString {
    public static void main(String[] args) {
        String S = "?nrvcxsg?gvbhbninxqxp?fz?jwdrywn?nlmrh?k?sb?sxqxjnuvvlhfib?x?x??ga";
        System.out.println(isGoodorBad(S));
    }

    static int isGoodorBad(String S) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int vowelsQtd = 0;
        int consonantsQtd = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (vowels.contains(c)) {
                vowelsQtd++;
                consonantsQtd = 0;
            } else if (c == '?') {
                vowelsQtd++;
                consonantsQtd++;
            } else {
                consonantsQtd++;
                vowelsQtd = 0;
            }
            if (vowelsQtd == 6 || consonantsQtd == 4) {
                return 0;
            }
        }

        return 1;
    }
}
