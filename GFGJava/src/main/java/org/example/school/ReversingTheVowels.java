package org.example.school;

import java.util.ArrayList;
import java.util.List;

public class ReversingTheVowels {
    public static void main(String[] args) {
        String S = "practice";
        System.out.print(modify(S));
    }

    static String modify(String s) {
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            char v = s.charAt(i);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                reverse += v;
            }
        }

        StringBuilder sb = new StringBuilder(reverse);
        StringBuilder sb2 = new StringBuilder(s);
        sb.reverse();

        int count = 0;
        for (int i = 0; i < sb2.length(); i++) {
            char v = sb2.charAt(i);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                sb2.setCharAt(i, sb.charAt(count));
                count++;
            }
        }

        return sb2.toString();
    }

    static String modify2(String s) {
        String[] arr = s.split("");
        List<Integer> position = new ArrayList<>();
        String rev = "";
        boolean contains = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("a")
                    || arr[i].contains("e")
                    || arr[i].contains("i")
                    || arr[i].contains("o")
                    || arr[i].contains("u")
            ) {
                rev += arr[i];
                position.add(i);
                contains = true;
            }
        }

        if (contains) {
            String reverse = String.valueOf(new StringBuilder(rev).reverse());
            String[] reverseArr = reverse.split("");

            for (int i = 0; i < reverseArr.length; i++) {
                arr[position.get(i)] = reverseArr[i];
            }
        }

        rev = "";
        for (String v:arr) {
            rev += v;
        }

        return rev;
    }
}
