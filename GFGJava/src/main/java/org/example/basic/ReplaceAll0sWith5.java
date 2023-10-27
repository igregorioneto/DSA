package org.example.basic;

public class ReplaceAll0sWith5 {
    public static void main(String[] args) {
        int N = 1004;
        System.out.println(convertFive(N));
    }

    static int convertFive(int num) {
        String res = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '0') {
                sb.append(5);
            } else {
                sb.append(res.charAt(i));
            }
        }
        return Integer.valueOf(sb.toString());
    }

    static int convertFive2(int num) {
        String res = String.valueOf(num);
        String r = "";
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '0') {
                r += '5';
            } else {
                r += res.charAt(i);
            }
        }
        return Integer.valueOf(r);
    }
}
