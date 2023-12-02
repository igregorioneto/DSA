package org.example.basic;

public class CountPairNum {
    public static void main(String[] args) {
        int M=4, N=4 , Sum = 8,
        arr1[] = {1, 2, 3, 4},
        arr2[] = {5, 6, 7, 8};
        System.out.println(countPairs(arr1, arr2, M, N, Sum));
    }

    static int countPairs(int arr1[], int arr2[], int M, int N, int x) {
        int count = 0, i = 0, j = N - 1;
        while (i < M && j >= 0) {
            int sum = arr1[i] + arr2[j];

            if (sum == x) {
                count++;
                i++;
                j--;
            } else if (sum < x) {
                i++;
            } else {
                j--;
            }
        }
        return count;
    }

    static int countPairs2(int arr1[], int arr2[], int M, int N, int x) {
        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N ; j++) {
                if (arr1[i] + arr2[j] == x) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
