package org.example.basic;

public class FindNumberOfNumbers {
    public static void main(String[] args) {
        int A[] = {11,12,13,14,15}, k=1;
        System.out.println(num(A, A.length, k));
    }

    static int num(int a[], int n, int k) {
        String s = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            s += a[i];
        }
        for (char c:s.toCharArray()) {
            if (c - '0' == k) count++;
        }
        return count;
    }
}
