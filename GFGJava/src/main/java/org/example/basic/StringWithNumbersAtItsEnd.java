package org.example.basic;

public class StringWithNumbersAtItsEnd {
    public static void main(String[] args) {
        String s = "gwfchbznorpwvj000014";
        System.out.println(isSame(s));
    }

    static int isSame(String s) {
        int strlen = s.length();
        int num = 0, count = 0;
        for (int i = 0; i < strlen; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
                num = (num * 10) + (s.charAt(i)-'0');
            }
        }
        return (strlen - count == num) ? 1 : 0;
    }

    static int isSame2(String s) {
        String res = s.substring(0,s.length() - 1);
        char lastChar = s.charAt(s.length() - 1);
        int lastCharNumericValue = Character.getNumericValue(lastChar);
        if (lastCharNumericValue == res.length()) return 1; else return 0;
    }
}
