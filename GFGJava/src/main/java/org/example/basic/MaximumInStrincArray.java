package org.example.basic;

import java.util.Arrays;

public class MaximumInStrincArray {
    static class Height {
        int feet;
        int inches;
        public Height(int ft, int inc)
        {
            feet = ft;
            inches = inc;
        }
    }
    public static void main(String[] args) {
        /*
        * n = 2
        h1 -> 1 2
        h2 -> 2 1
        * */
        int n = 2;
        Height h1 = new Height(1,2), h2 = new Height(2,1);
        Height arr[] = new Height[n];
        arr[0] = h1;
        arr[1] = h2;
        System.out.println(findMax(arr, n));
    }

    static int findMax(Height arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int height = arr[i].feet * 12 + arr[i].inches;
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
