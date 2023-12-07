package org.example.basic;

import java.util.ArrayList;

public class PositiveAndNegativeElements {
    public static void main(String[] args) {
        int N = 6;
        long arr[] = {-1, 2, -3, 4, -5, 6};

        for (long e:arranged(arr, N)) {
            System.out.print(e + " ");
        }
    }

    static ArrayList<Long> arranged(long a[], int n) {
        ArrayList<Long> pos = new ArrayList<>();
        ArrayList<Long> neg = new ArrayList<>();
        int positiveIndex = 0, negativeIndex = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] < 0)
                neg.add(a[i]);
            if (a[i] > 0)
                pos.add(a[i]);
        }

        ArrayList<Long> arr = new ArrayList<>();
        for (int i = 0; i < n - 1 ; i+=2) {
            arr.add(pos.get(positiveIndex++));
            arr.add(neg.get(negativeIndex++));
        }

        return arr;
    }

    static ArrayList<Long> arranged2(long a[], int n) {
        ArrayList<Long> arr = new ArrayList<>();
        int positiveIndex = 0, negativeIndex = 0;
        while (arr.size() < n) {
            for (int i = 0; i < n; i++) {
               if (!arr.contains(a[i]) && a[i] > 0) {
                   arr.add(a[i]);
                   break;
               }
            }

            for (int i = 0; i < n; i++) {
                if (!arr.contains(a[i]) && a[i] < 0) {
                    arr.add(a[i]);
                    break;
                }
            }
        }
        return arr;
    }

}
