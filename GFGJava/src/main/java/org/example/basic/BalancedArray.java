package org.example.basic;

public class BalancedArray {
    public static void main(String[] args) {
        int N = 16;
        long arr[] = { 5512, 9493, 6319, 7495, 1725, 9719, 8305, 410, 4862, 2154, 8357, 5887, 1151, 4483, 6770, 5179 };
        System.out.println(minValueToBalance(arr, N));
    }

    static int minValueToBalance(long a[], int n) {
        int valuesLeft = 0, valuesRight = 0, resul = 0;
        for (int i = 0; i < n / 2; i++) {
            valuesLeft += a[i];
        }
        for (int i = n / 2; i < n; i++) {
            valuesRight += a[i];
        }
        if ((valuesLeft - valuesRight) < 0) {
            resul = (valuesLeft - valuesRight) * -1;
        } else {
            resul = (valuesLeft - valuesRight);
        }

        return resul;
    }
}
