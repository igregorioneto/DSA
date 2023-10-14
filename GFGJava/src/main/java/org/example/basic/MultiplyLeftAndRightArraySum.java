package org.example.basic;

public class MultiplyLeftAndRightArraySum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(multiply(arr, arr.length));
    }

    static int multiply(int arr[], int n) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = n - 1; i >= (n / 2) ; i--) {
            sum2 += arr[i];
        }
        return sum1 * sum2;
    }
}
