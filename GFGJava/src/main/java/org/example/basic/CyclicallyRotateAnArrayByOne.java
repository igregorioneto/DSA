package org.example.basic;

public class CyclicallyRotateAnArrayByOne {
    public static void main(String[] args) {
        int N = 5, A[] = {1, 2, 3, 4, 5};
        rotate(A, N);
        for (int e:A) {
            System.out.print(e + " ");
        }
    }

    static void rotate(int arr[], int n) {
        int temp = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }
}
