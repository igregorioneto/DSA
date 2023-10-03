package org.example.medium;

import java.util.HashMap;
import java.util.Map;

public class ColumnNameFromAGivenColumnNumber {
    public static void main(String[] args) {
        long N = 27;
        System.out.print(colName(N));
    }

    static String colName(long n) {
        String s = "";
        if (n <= 26){
            s = Character.toString((char) (64 + n));
        } else {
            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                n--;
                char ch = (char)('A' + (n % 26));
                sb.insert(0,ch);
                n /= 26;
            }
            s = sb.toString();
        }
        return s;
    }

    static String colName2(long n) {
        String arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", s = "";

        while (n > 0) {
            int p = (int) n % 26;
            if (p == 0) {
                s += arr.charAt(25);
                n = n /26;
                n--;
            } else {
                s += arr.charAt(p - 1);
                n = n / 26;
            }
        }

        return new StringBuilder(String.valueOf(s)).reverse().toString();
    }
}
