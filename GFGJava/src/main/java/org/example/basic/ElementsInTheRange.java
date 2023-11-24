package org.example.basic;

import java.util.ArrayList;

public class ElementsInTheRange {
    public static void main(String[] args) {
        int N = 7, A = 2, B = 5,
        arr[] =  {1, 4, 5, 2, 7, 8, 3};
        System.out.println(check_elements(arr, N, A, B));
    }

    static boolean check_elements(int arr[], int n, int A, int B) {
        int size = Math.abs(A - B) + 1, a[] = new int[size];
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
                a[i] = A++;
        }
        for (int e:arr) {
            newArr.add(e);
        }
        for (int i = 0; i < a.length; i++) {
            if (!newArr.contains(a[i])) return false;
        }
        return true;
    }
}
