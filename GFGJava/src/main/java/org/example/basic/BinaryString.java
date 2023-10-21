package org.example.basic;

public class BinaryString {
    public static void main(String[] args) {
        int N = 4;
        String S = "1111";
        System.out.println(binarySubstring(N, S));
    }

    static int binarySubstring(int a, String str) {
        int count = 0;

        for (int i = 0; i < a; i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }

        return count * (count - 1) / 2;
    }

    static int binarySubstring2(int a, String str) {
        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j <= a; j++) {
                String sub = str.substring(i,j);
                int sublength = sub.length();
                if (sub.length() > 1 && (sub.charAt(0) == '1' && sub.charAt(sublength - 1) == '1')) {
                    count++;
                }
            }
        }
        return count;
    }
}
