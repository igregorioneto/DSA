package org.example.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberToInteger {
    public static void main(String[] args) {
        String s = "XIX";
        System.out.print(romanToDecimal(s));
    }

    static int romanToDecimal(String str) {
        int sum = 0;
        int n = 0;
        for (int i = str.length() - 1; i >= 0 ; i--) {
            switch (str.charAt(i)) {
                case 'I': n = 1; break;
                case 'V': n = 5; break;
                case 'X': n = 10; break;
                case 'L': n = 50; break;
                case 'C': n = 100; break;
                case 'D': n = 500; break;
                case 'M': n = 1000; break;
            }
            if (4 * n < sum) sum -= n; else sum += n;
        }
        return sum;
    }
}
