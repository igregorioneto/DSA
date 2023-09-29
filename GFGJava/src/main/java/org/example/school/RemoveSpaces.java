package org.example.school;

public class RemoveSpaces {
    public static void main(String[] args) {
        String S = "geeks  for geeks";
        System.out.print(modify(S));
    }

    static String modify(String S) {
        return S.replace(" ", "");
    }
}
