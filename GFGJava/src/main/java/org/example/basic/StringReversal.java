package org.example.basic;

public class StringReversal {
    public static void main(String[] args) {
        String S = "GEEKS FOR GEEKS";
        System.out.println(reverseString(S));
    }

    static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char c = s.charAt(i);
            if (c != ' ' && sb.indexOf(c+"") == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
