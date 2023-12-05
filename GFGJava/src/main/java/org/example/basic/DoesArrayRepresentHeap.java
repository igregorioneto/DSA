package org.example.basic;

public class DoesArrayRepresentHeap {
    public static void main(String[] args) {
        long arr[] = {90, 15, 10, 7, 12, 2};
        System.out.println(countSub(arr, arr.length));
    }

    static boolean countSub(long arr[], long n) {
        int size = arr.length;
        for (int i = size - 1; i > 0 ; i--) {
            if (arr[i] > arr[(i - 1) / 2])
                return false;
        }
        return true;
    }
}
