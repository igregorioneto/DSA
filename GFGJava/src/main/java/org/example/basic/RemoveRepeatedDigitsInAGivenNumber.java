package org.example.basic;

public class RemoveRepeatedDigitsInAGivenNumber {
    public static void main(String[] args) {
        long N = 1224;
        System.out.println(modify(N));
    }

    static long modify(long N) {
        String s = String.valueOf(N);
        String r = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                r += s.charAt(i);
            }
        }
        r += s.charAt(s.length() - 1);
        return Long.valueOf(r);
    }

    static long modify2(long N) {
        String s = String.valueOf(N);
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        for (int i = 1; i < n; i++) {
            char curr = s.charAt(i);
            if (curr != prev) {
                sb.append(prev);
                prev = curr;
            }
        }
        sb.append(s.charAt(n - 1));
        return Long.valueOf(sb.toString());
    }
}
