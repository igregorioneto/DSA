package org.example.basic;

public class RemoveCommonCharactersAndConcatenate {
    public static void main(String[] args) {
        String s1 = "aaa", s2 = "aa";
        System.out.println(concatenatedString(s1, s2));
    }

    static String concatenatedString(String s1, String s2) {
        String r = "";
        char arr_s1[] = s1.toCharArray();
        char arr_s2[] = s2.toCharArray();

        for (char s:arr_s1) {
            if (!s2.contains(String.valueOf(s))) r += s;
        }

        for (char s:arr_s2) {
            if (!s1.contains(String.valueOf(s))) r += s;
        }

        if (r.length() == 0) r = "-1";

        return r;
    }
}
