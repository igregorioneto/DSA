package org.example.basic;

public class ThePenaltyShootout {
    public static void main(String[] args) {
        String S = "1012012112110";
        System.out.println(penaltyScore(S));
    }

    static int penaltyScore(String S) {
        int score = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == '2' && S.charAt(i + 1) == '1') {
                score++;
            }
        }
        return score;
    }
}
