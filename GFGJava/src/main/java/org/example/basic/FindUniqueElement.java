package org.example.basic;

import java.util.Arrays;
import java.util.HashMap;

public class FindUniqueElement {
    public static void main(String[] args) {
        int n = 7, k = 3,
        arr[] = {6, 2, 5, 2, 2, 6, 6};
        System.out.println(findUnique(arr, n, k));
    }

    static int findUnique(int a[], int n, int k) {
        Arrays.sort(a);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                if ((count % k) != 0) {
                    return a[i - 1];
                }
                count = 1;
            }
        }
        return a[n - 1];
    }
}
