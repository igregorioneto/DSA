package org.example.basic;

public class PerfectSquareString {
    public static void main(String[] args) {
        String S = "1Qy";
        System.out.println(isSquare(S));
    }

    static int isSquare(String S) {
        double values = 0;
        for (char c:S.toCharArray()) {
            values += (int) c;
        }
        int rootSquare = (int) Math.sqrt(values);
        return rootSquare * rootSquare == values ? 1 : 0;
    }
}
