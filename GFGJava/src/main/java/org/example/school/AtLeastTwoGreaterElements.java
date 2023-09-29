package org.example.school;

import java.util.Arrays;

public class AtLeastTwoGreaterElements {
    public static void main(String[] args) {
        long a[] = {2, 8, 7, 1, 5};
        for (long e:findElements(a,5)) {
            System.out.print(e + " ");
        }
    }

    public static long[] findElements(long a[], int n) {
        Arrays.sort(a);
        long[] array = new long[a.length - 2];
        for (int i = 0; i < a.length - 2; i++) {
            array[i] = a[i];
        }
        return array;
    }
}
