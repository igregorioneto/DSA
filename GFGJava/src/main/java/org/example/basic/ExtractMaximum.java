package org.example.basic;

public class ExtractMaximum {
    public static void main(String[] args) {
        String S = "100000";
        System.out.println(extractMaximum(S));
    }

    static int extractMaximum(String S) {
        int num = -1;
        String arr = "";
        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                arr += S.charAt(i);
            } else if (!Character.isDigit(S.charAt(i))) {
                arr = "";
            }
            if (arr.length() > 0) {
                if (Integer.parseInt(arr) > num) {
                    num = Integer.parseInt(arr);
                }
            }
        }
        return num;
    }
}
