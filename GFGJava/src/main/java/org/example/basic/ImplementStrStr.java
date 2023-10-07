package org.example.basic;

public class ImplementStrStr {
    public static void main(String[] args) {
        String s = "GeeksForGeeks", x = "For";
        System.out.print(strstr(s, x));
    }

    static int strstr(String s, String x) {
        if (s.indexOf(x) != -1) {
            return s.indexOf(x);
        }
        return -1;
    }
}
