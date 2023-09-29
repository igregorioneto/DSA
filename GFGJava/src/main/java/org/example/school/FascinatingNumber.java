package org.example.school;

public class FascinatingNumber {
    public static void main(String[] args) {
        long N = 853;
        System.out.print(fascinating(N));
    }

    static boolean fascinating(long n) {
        String r = "" + n + (n * 2) + (n * 3);
        boolean contains = r.contains("1") && r.contains("2")
                && r.contains("3")
                && r.contains("4")
                && r.contains("5")
                && r.contains("6")
                && r.contains("7")
                && r.contains("8")
                && r.contains("9");
        if (r.length() == 9 && contains) return true;
        return false;
    }

}
