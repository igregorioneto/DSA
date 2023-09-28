package org.example;

public class PerfectArrays {
    public static void main(String[] args) {
        int a[] = {20, 4 ,15, 10, 14, 19, 11, 8, 5 ,19, 13, 8, 18, 13, 3 ,12, 8, 16, 19, 11};
        System.out.print(IsPerfect(a,20));
    }

    public static boolean IsPerfect(int a[], int n) {
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) return false;
        }
        return true;
    }
}
