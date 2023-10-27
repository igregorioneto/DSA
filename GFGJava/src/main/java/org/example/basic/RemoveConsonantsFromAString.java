package org.example.basic;

public class RemoveConsonantsFromAString {
    public static void main(String[] args) {
        String S = "abEkipo";
        System.out.println(removeConsonants(S));
    }

    static String removeConsonants(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (isConsonant(currentChar)) sb.append(currentChar);
        }
        if (sb.length() > 0) return sb.toString(); else return "No Vowel";
    }

    static boolean isConsonant(char c) {
        return ("aeiouAEIOU".indexOf(c) >=0);
    }

    static String removeConsonants2(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            boolean isConsonants = isConsonants2(s.charAt(i));
            if (isConsonants) res += s.charAt(i);
        }
        if (res.length() > 0) return res; else return "No Vowel";
    }

    static boolean isConsonants2(char c) {
        return c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'u';
    }
}
