package org.example.basic;

public class PrintFirstLetterOfEveryWordIntheString {
    public static void main(String[] args) {
        String S = "geeks for geeks";
        System.out.println(firstAlphabet(S));
    }

    static String firstAlphabet(String S) {
        String arr[] = S.split(" ");
        S = "";
        for (String s:arr) {
            S += s.charAt(0);
        }
        return S;
    }
}
