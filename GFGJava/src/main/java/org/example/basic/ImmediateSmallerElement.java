package org.example.basic;

public class ImmediateSmallerElement {

    public static void main(String[] args) {
        int N = 5, Arr[] = {4, 2, 1, 5, 3};
        immediateSmaller(Arr, N);
        for (int e:Arr) {
            System.out.print(e + " ");
        }
    }

    static void immediateSmaller(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
        arr[n - 1] = -1;
    }
}
