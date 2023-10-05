package org.example.basic;

public class SearchAnElementInAnArray {
    public static void main(String[] args) {
        int n = 4, arr[] = {1,2,3,4}, x = 5;
        System.out.print(search(arr, n, x));
    }

    static int search(int arr[], int N, int X) {
        int find = -1;

        for (int i = 0; i < arr.length; i++) {
            if (X == arr[i]) {
                find = i;
                break;
            }
        }

        return find;
    }
}
