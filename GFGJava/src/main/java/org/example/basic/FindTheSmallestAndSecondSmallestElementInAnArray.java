package org.example.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheSmallestAndSecondSmallestElementInAnArray {
    public static void main(String[] args) {
        long n = 6, a[] = {1 ,1 ,1, 1 ,1, 7};
        for (long e:minAnd2ndMin(a, n)) {
            System.out.print(e + " ");
        }
    }

    static long[] minAnd2ndMin(long a[], long n) {
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2 && a[i] != min1) {
                min2 = a[i];
            }
        }

        return (min2 == Long.MAX_VALUE) ? new long[]{-1} : new long[] {min1, min2};
    }

    static long[] minAnd2ndMin2(long a[], long n) {
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2 && a[i] != min1) {
                min2 = a[i];
            }
        }

        if (min2 == Long.MAX_VALUE) {
            return new long[] {-1};
        } else {
            return new long[] {min1, min2};
        }
    }
}
