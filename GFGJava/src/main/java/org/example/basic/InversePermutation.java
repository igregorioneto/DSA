package org.example.basic;

import java.util.ArrayList;

public class InversePermutation {
    public static void main(String[] args) {
        int N = 5,
        Arr[] = {2, 3, 4, 5, 1};

        for (int e:inversePermutation(Arr, N)) {
            System.out.print(e + " ");
        }
    }

    static ArrayList<Integer> inversePermutation(int arr[], int n) {
        int index = 1, v[] = new int[n];
        ArrayList<Integer> inverse = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int idx = (arr[i]  - 1);
            v[idx] = index;
            index++;
        }

        for (int i = 0; i < n; i++) {
            inverse.add(v[i]);
        }

        return inverse;
    }
}
