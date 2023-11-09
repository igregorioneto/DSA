package org.example.basic;

public class TriangleGrowingDownwards {
    public static void main(String[] args) {
        String str = "geeks";
        printTriangleDownwards(str);
    }

    static void printTriangleDownwards(String str) {
        String concat = "";
        for (int i = 0; i < str.length(); i++) {
            concat += ".";
        }
        int n = 1;
        for (int i = 0; i < str.length(); i++) {
            concat += str.charAt(i);
            System.out.println(concat.substring(n));
            n++;
        }
    }
}
