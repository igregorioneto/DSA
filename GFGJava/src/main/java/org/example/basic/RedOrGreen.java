package org.example.basic;

public class RedOrGreen {
    public static void main(String[] args) {
        int N=5;
        String S="RGRGR";
        System.out.println(RedOrGreen(N, S));
    }

    static int RedOrGreen(int N, String S) {
        int countR = 0, countG = 0;
        for (char c:S.toCharArray()) {
            if (c == 'R') countR++; else countG++;
        }
        return Math.min(countR, countG);
    }

    static int RedOrGreen2(int N, String S) {
        // Descobrir a quantidade de caracteres R ou G
        // Com base na quantidade descobrir quantos faltas para armazenar R ou G
        int countR = 0, countG = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'R')  countR++; else countG++;
        }
        int result = countR > countG ? countG : countR;
        return result;
    }
}
