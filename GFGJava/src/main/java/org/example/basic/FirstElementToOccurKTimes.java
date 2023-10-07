package org.example.basic;

import java.util.HashMap;
import java.util.Map;

public class FirstElementToOccurKTimes {
    public static void main(String[] args) {
        int N = 7, K = 2, A[] = {1, 7, 4, 3, 4, 8, 7};
        System.out.print(firstElementKTime(A, N, K));
    }

    static int firstElementKTime(int[] a, int n, int k) {
        Map<Integer, Integer> arr = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = a[i];
            arr.put(x, arr.getOrDefault(x,0) + 1);
            if (arr.get(x) >= k) {
                return x;
            }
        }
        return -1;
    }
}
