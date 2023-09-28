package org.example;

public class PerfectArrays {
    public static void main(String[] args) {
        int a[] = {20, 4 ,15, 10, 14, 19, 11, 8, 5 ,19, 13, 8, 18, 13, 3 ,12, 8, 16, 19, 11};
        System.out.print(IsPerfect(a, a.length));
    }

    public static boolean IsPerfect(int a[], int n) {
        String reverse = "";
        String arr = "";

        for (int e:a) {
            arr += e;
        }

        for (int i = n - 1; i >= 0 ; i--) {
            reverse += a[i];
        }

        if (arr.equals(reverse)) return true;
        return false;
    }
}
