package org.example.basic;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
        int N = 4 , X = 5,
        arr[] = { 1, 2, 3, 4 };
        for (int e :firstAndLast(arr, N, X)) {
            System.out.print(e + " ");
        }
    }

    static ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                a.add(i);
                break;
            }
        }

        for (int i = n - 1; i >= 0 ; i--) {
            if (arr[i] == x) {
                a.add(i);
                break;
            }
        }

        if (a.size() == 0) {
            a.add(-1);
        }

        return a;
    }
}
