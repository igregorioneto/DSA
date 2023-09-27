package org.example;

public class FindIndex {
    public static void main(String[] args) {
        int arr[] = {21 ,10, 16, 12, 18, 18, 30, 23, 12, 28};
        int arrays[] = findIndex(arr, 10,21);
        for (int n:arrays) {
            System.out.print(n + " ");
        }
    }

    public static int[] findIndex(int a[], int N, int key) {
        int arrays[] = {-1,-1};
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                arrays[0] = i;
                break;
            }
        }

        for (int i = N - 1; i >= 0 ; i--) {
            if(a[i] == key) {
                arrays[1] = (i);
                break;
            }
        }
        return arrays;
    }
}
