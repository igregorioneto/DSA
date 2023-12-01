package org.example.basic;

public class PlayWithAnArray {
    public static void main(String[] args) {
        int n = 4,
        arr[] = {4, 3, 2, 1};
        for (int e:formatArray(arr, n)) {
            System.out.print(e + " ");
        }
    }

    static int[] formatArray(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            if ((i + 1) % 2 == 1 && a[i + 1] < a[i]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        return a;
    }
}
