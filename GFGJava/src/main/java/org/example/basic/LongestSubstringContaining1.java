package org.example.basic;

public class LongestSubstringContaining1 {
    public static void main(String[] args) {
        String s = "11011110111110110111111";
        System.out.println(count(s));
    }

    static int count(String s) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    static int count2(String s) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (value == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        if (max < 0) return 0;
        return max;
    }
}
