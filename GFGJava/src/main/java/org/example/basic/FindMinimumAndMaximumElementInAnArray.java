package org.example.basic;

import java.util.Arrays;
import java.util.OptionalLong;

class Pair {
    long first, second;
    public Pair(long first,long second) {
        this.first = first;
        this.second = second;
    }
}

public class FindMinimumAndMaximumElementInAnArray {


    public static void main(String[] args) {
        long N = 6, A[] = {3, 2, 1, 56, 10000, 167};
        Pair p = getMinMax(A, N);
        System.out.print(p.first + " " + p.second);
    }

    static Pair getMinMax(long a[], long n) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (max < a[i])
                max = a[i];
            if (min > a[i])
                min = a[i];
        }
        Pair p = new Pair(min, max);
        return p;
    }

    static Pair getMinMax2(long a[], long n) {
        OptionalLong min = Arrays.stream(a).min();
        OptionalLong max = Arrays.stream(a).max();
        long first = min.getAsLong();
        long second = max.getAsLong();
        return new Pair(first, second);
    }

}
