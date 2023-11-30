package org.example.basic;

public class TotalCount {
    public static void main(String[] args) {
        int N = 4, K = 3,
        Arr[] = {5, 8, 10, 13};
        System.out.println(totalCount(Arr, N, K));
    }

    static int totalCount(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += arr[i] / k;
            if (arr[i] % k != 0 || arr[i] < k) {
                count++;
            }
        }
        return count;
    }
}
