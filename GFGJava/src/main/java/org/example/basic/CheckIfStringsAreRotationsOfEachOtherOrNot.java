package org.example.basic;

public class CheckIfStringsAreRotationsOfEachOtherOrNot {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks", s2 = "forgeeksgeeks";
        System.out.println(areRotations(s1, s2));
    }

    static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return ((s1 + s1).indexOf(s2) >= 0);
    }
}
