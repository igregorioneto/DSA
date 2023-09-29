package org.example.school;

public class ReverseAString {
    public static void main(String[] args) {
        String S = "GeeksforGeeks";
        System.out.print(revStr(S));
    }

    static String revStr(String S) {
        return String.valueOf(new StringBuilder(S).reverse());
    }
}
