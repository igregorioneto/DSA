package org.example.basic;

public class ExceptionallyOdd {
    public static void main(String[] args) {
        int N = 5, Arr[] = {8, 4 ,4, 8 ,23};
        System.out.println(getOddOccurrence(Arr, N));
    }

    static int getOddOccurrence(int[] arr, int n) {
        int count = 0;
        for (int i:arr) {
            count^=i;
        }
        return count;
    }

    static int getOddOccurrence2(int[] arr, int n) {
        int a[] = new int[100000];
        for (int i = 0; i < n; i++) {
            a[arr[i]]++;
        }

        for (int i = 0; i <= 100000; i++) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
}
