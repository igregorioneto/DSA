package org.example.easy;

public class PredictTheColumn {
    public static void main(String[] args) {
        int N = 3,
        M[][] = {{0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}};
        System.out.println(columnWithMaxZeros(M, N));
    }

    static int columnWithMaxZeros(int arr[][], int N) {
        boolean hasZero = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (hasZero) break;
        }

        if (!hasZero) return -1;

        int max = -1, index = -1;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == 0) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }
        return index;
    }
}
