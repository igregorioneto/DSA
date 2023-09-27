package org.example;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.print(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String reverse = String.valueOf(new StringBuffer(String.valueOf(x)).reverse());
        return String.valueOf(x).equals(reverse) ? true : false;
    }
}
