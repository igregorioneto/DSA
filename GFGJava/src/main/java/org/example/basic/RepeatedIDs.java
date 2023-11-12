package org.example.basic;

import java.util.*;

public class RepeatedIDs {
    public static void main(String[] args) {
        int N = 5;
        long a[ ] = {8, 8, 6, 2, 1};
        for (int e: uniqueId(a, N)) {
            System.out.print(e + " ");
        }
    }

    static int[] uniqueId(long arr[], long n) {
        LinkedHashSet<Long> a = new LinkedHashSet();
        for (long e : arr) {
            a.add(e);
        }

        int[] newArray = new int[a.size()];
        int count = 0;
        for (long e:a) {
            newArray[count++] = (int) e;
        }

        return newArray;
    }
}
