package org.example;

public class SumOfArray {
    public static void main(String[] args) {
        long[] a = {1,2,3,4};
        System.out.println(getSum2(a, 4));
    }

    public static long getSum(long a[], long n) {
        long sum = 0;
        if (a.length == n) {
            for (long v:a) {
                sum += v;
            }
        }
        return sum;
    }

    public static long getSum2(long a[], long n) {
        long sum = 0;
        for (int i = 0; i < n; i++) sum += a[i];
        return sum;
    }
}
