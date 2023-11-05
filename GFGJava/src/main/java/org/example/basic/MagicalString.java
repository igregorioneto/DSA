package org.example.basic;

public class MagicalString {
    public static void main(String[] args) {
        String S = "varun";
        System.out.println(magicalString(S));
    }

    static String magicalString(String S) {
        char arr[] = S.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c >= 'a' && c <= 'z') {
                arr[i] = (char) ('a' + 'z' - c);
            }
        }
        return new String(arr);
    }
}
