package org.example.basic;

public class ReadingBooks {
    public static void main(String[] args) {
        int N = 3;
        long K = 10, A[] = {3, 4, 5}, B[] = {4, 4, 5};
        System.out.println(maxPoint(N, K, A, B));
    }

    static long maxPoint(int N, long K, long A[], long B[]) {
        long max = 0;
        for (int i = 0; i < N; i++) {
            long times = K / A[i];
            long prod = times * B[i];
            if (prod > max) {
                max = prod;
            }
        }
        return max;
    }
}
