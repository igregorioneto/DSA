package org.example.basic;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String S = "bcdebeaec";
        System.out.println(removeConsecutiveCharacter(S));
    }
    // bcdebeaec
    static String removeConsecutiveCharacter(String S) {
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        for (int i = 0; i < S.length(); i++) {
            if (i + 1 < S.length() && S.charAt(i) != S.charAt(i + 1)) {
                sb.append(S.charAt(i + 1));
            }
        }
        return sb.toString();
    }
}
