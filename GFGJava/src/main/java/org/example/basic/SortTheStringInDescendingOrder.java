package org.example.basic;

import java.util.Arrays;

public class SortTheStringInDescendingOrder {
    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(ReverseSort(str));
    }

    static String ReverseSort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char aux = arr[left];
            arr[left] = arr[right];
            arr[right] = aux;
            left++;
            right--;
        }

        return new String(arr);
    }
}
