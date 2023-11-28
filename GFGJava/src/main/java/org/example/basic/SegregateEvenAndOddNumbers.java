package org.example.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class SegregateEvenAndOddNumbers {
    public static void main(String[] args) {
        int N = 7,
        Arr[] = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(Arr, N);
        for (int e:Arr) {
            System.out.print(e + " ");
        }
    }

    static void segregateEvenOdd(int arr[], int n) {
        Arrays.sort(arr);
        int k = 0, ans[] = new int[n];
        for (int i = 0; i < n; i++)
            if (arr[i] % 2 == 0)
                ans[k++] = arr[i];

        for (int i = 0; i < n; i++)
            if (arr[i] % 2 == 1)
                ans[k++] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = ans[i];

    }

    static void segregateEvenOdd2(int arr[], int n) {
        Arrays.sort(arr);
        ArrayList<Integer> even = new ArrayList<>(), odd = new ArrayList<>(), a = new ArrayList<>();
        for (int e:arr) {
            if (e % 2 == 0) {
                even.add(e);
            } else {
                odd.add(e);
            }
        }
        for (int e:even) {
            a.add(e);
        }
        for (int e:odd) {
            a.add(e);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.get(i);
        }
    }
}
