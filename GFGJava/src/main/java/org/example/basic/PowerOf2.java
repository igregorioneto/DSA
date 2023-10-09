package org.example.basic;

public class PowerOf2 {
    public static void main(String[] args) {
        long N = 6;
        System.out.println(isPowerofTwo(N));
    }

    public static boolean isPowerofTwo(long n) {
        while (n >= 1) {
            if (n == 1) {
                return true;
            } else if (n % 2 == 1 || n == 0) {
                return false;
            }
            n = n / 2;
        }
        return false;
    }
}
