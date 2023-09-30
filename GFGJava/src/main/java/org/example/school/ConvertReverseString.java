package org.example.school;

public class ConvertReverseString {
    public static void main(String[] args) {
        String S1 = "Geeks";
        String S2 = "forGeeks";
        System.out.print(conRevstr(S1, S2));
    }

    static String conRevstr(String S1, String S2) {
        StringBuilder sb = new StringBuilder(S1);
        StringBuilder sb2 = new StringBuilder(S2);
        sb.reverse();
        sb2.reverse();
        return sb2.toString() + sb.toString();
    }
}
