package org.example.school;

public class CheckString {
    public static void main(String[] args) {
        String s = "gggggggggggggggggggggggggggggggggggggggggg";
        System.out.print(check(s));
    }

    static Boolean check(String s) {
        Boolean checked = true;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    checked = false;
                    break;
                }
            }
        }
        return checked;
    }
}
