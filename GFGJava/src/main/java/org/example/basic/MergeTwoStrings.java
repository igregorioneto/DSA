package org.example.basic;

public class MergeTwoStrings {
    public static void main(String[] args) {
        String S1 = "Hello", S2 = "Bye";
        System.out.println(merge(S1, S2));
    }

    static String merge(String S1, String S2) {
        int n = S1.length() >= S2.length() ? S1.length() : S2.length();
        String s = "";
        for (int i = 0; i < n; i++) {
            if (i < S1.length() && S1.charAt(i) != ' ') {
                s += S1.charAt(i);
            }

            if (i < S2.length() && S2.charAt(i) != ' ') {
                s += S2.charAt(i);
            }
        }
        return s;
    }
}
