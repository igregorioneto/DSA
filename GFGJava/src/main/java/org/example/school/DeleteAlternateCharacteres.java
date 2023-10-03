package org.example.school;

public class DeleteAlternateCharacteres {
    public static void main(String[] args) {
        String S = "GeeksforGeeks";
        System.out.print(delAlternate(S));
    }

    static String delAlternate(String s) {
        String alternate = s;
        s = "";
        for (int i = 0; i < alternate.length(); i++) {
            if (i%2 == 0) s+= alternate.charAt(i);
        }
        return s;
    }
}
