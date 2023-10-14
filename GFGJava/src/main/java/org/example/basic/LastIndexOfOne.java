package org.example.basic;

public class LastIndexOfOne {
    public static void main(String[] args) {
        String S = "00001";
        System.out.println(lastIndex(S));
    }

    static int lastIndex(String s) {
        int occurence = -1;
        if (s.contains("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') occurence = i;
            }
        }
        return occurence;
    }
}
