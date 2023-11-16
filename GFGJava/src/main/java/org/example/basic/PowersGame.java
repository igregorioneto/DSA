package org.example.basic;

import java.util.HashSet;
import java.util.Set;

public class PowersGame {
    public static void main(String[] args) {
        int X = 15, N = 3;
        for (int e:getFreq(X, N)) {
            System.out.print(e + " ");
        }
    }

    static int[] getFreq(int x, int n) {
        int[] arr = new int[10];

        long number = 1;

        for (int i = 1; i <= n ; i++) {
            number *= x;

            long num = number;

            while(num > 0) {
                int rem = (int) (num % 10);
                ++arr[rem];
                num /= 10;
            }
        }
        return arr;
    }
}
