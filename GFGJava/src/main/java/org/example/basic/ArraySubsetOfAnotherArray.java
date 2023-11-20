package org.example.basic;

import java.util.*;

public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        long a1[] = {1 ,2 ,3 ,4, 5, 6 ,7, 8},
        a2[] = {1, 2,3 ,1};
        System.out.println(isSubset(a1, a2, a1.length, a2.length));
    }

    static String isSubset(long a1[], long a2[], long n, long m) {
        HashMap<Long, Long> arr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr.put(a1[i], arr.getOrDefault(a1[i], (long)0) + 1);
        }

        for (int i = 0; i < m; i++) {
            if (arr.get(a2[i]) == null || arr.get(a2[i]) == 0) {
                return "No";
            } else {
                arr.put(a2[i], arr.get(a2[i]) - 1);
            }
        }
        return "Yes";
    }
}
