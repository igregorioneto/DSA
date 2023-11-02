package org.example.basic;

public class RockPaperScissors {
    public static void main(String[] args) {
        String S = "SR";
        System.out.println(gameResult(S));
    }

    static String gameResult(String s) {
        char a = s.charAt(0);
        char b = s.charAt(1);
        if ((a == 'R' && b == 'S') || (a == 'S' && b == 'P') || (a == 'P' && b == 'R')) {
            return "A";
        } else if ((b == 'R' && a == 'S') || (b == 'S' && a == 'P') || (b == 'P' && a == 'R')) {
            return "B";
        }
        return "DRAW";
    }
}
