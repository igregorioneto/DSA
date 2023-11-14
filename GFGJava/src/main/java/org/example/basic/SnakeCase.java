package org.example.basic;

public class SnakeCase {
    public static void main(String[] args) {
        int N = 14;
        String S = "Geeks ForGeeks";
        System.out.println(snakeCase(S, N));
    }

    static String snakeCase(String S, int n) {
        S = S.toLowerCase().replace(" ", "_");
        return S;
    }
}
