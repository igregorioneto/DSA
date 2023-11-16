package org.example.basic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AbsoluteDifferenceOf1 {
    public static void main(String[] args) {
        int n = 8;
        long k = 54, arr[] = {7, 98, 56, 43, 45, 23, 12, 8};
        for (long e:getDigitDiff1AndLessK(arr, n, k)) {
            System.out.print(e + " ");
        }
    }

    static long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        ArrayList<Long> a = new ArrayList<>();
        for (long e:arr) {
            if (e < k && String.valueOf(e).length() > 1) {
                boolean isDiff = true;
                for (int i = 0; i < String.valueOf(e).length() - 1; i++) {
                    int result = Math.abs(String.valueOf(e).charAt(i) - String.valueOf(e).charAt(i + 1));
                    if (result != 1) {
                        isDiff = false;
                        break;
                    }
                }

                if (isDiff)
                    a.add(e);
            }
        }
        if (a.size() == 0) return new long[]{-1};
        long r[] = new long[a.size()];
        for (int i = 0; i < r.length; i++) {
            r[i] = a.get(i);
        }
        return r;
    }
}
