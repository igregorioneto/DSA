package org.example.basic;

import java.util.Arrays;

public class MaximizeSumOfAnArray {
    public static void main(String[] args) {
       int n = 5, Arr[] = {
               18761 ,26480 ,31525, 20588 ,21862 ,30373, 18304, 3463 ,24555 ,23625 ,
               21013 ,15347 ,32013 ,25555 ,9121 ,31935 ,23772,
               23686, 22, 21866, 2684 ,28636, 3329, 24739, 22286 ,27735, 1938, 32281 ,
               13561, 8197, 6945, 31808 ,11735 ,26760};
       System.out.print(Maximize(Arr, n));
    }

    static int Maximize(int arr[], int n) {
        Arrays.sort(arr);
        long sum = 0, mod = (long)(Math.pow(10,9)+7);
        int i = 0;
        while (i < arr.length) {
            sum +=  ((long)i * arr[i]) % mod;
            i++;
        }
        sum = sum % mod;
        return (int) sum;
    }

    static int Maximize2(int arr[], int n) {
        Arrays.sort(arr);
        int sum = 0, i = 0;
        while (i < arr.length) {
            sum += (i * arr[i]);
            i++;
        }
        return sum;
    }
}
