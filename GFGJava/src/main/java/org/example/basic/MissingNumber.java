package org.example.basic;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int N = 5, A[] = {2, 5, 3, 1};
        System.out.println(missingNumber(A, N));
    }

    static int missingNumber(int A[], int N) {
        int n = A.length;
        boolean[] seen = new boolean[n + 1];

        // Vai adicionar no array boolean true quando o valor do elemento
        // respeitar a seguinte condição.
        for (int e:A) {
            if (e > 0 && e <= n) {
                seen[e] = true;
            }
        }

        // Verifica o primeiro número da posição que tem um valor false
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) return i;
        }
        // Caso todos os números forem presentes
        return n + 1;
    }

    static int missingNumber2(int A[], int N) {
        int count = 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int aux = A[j];
                    A[j] = A[i];
                    A[i] = aux;
                }
            }
            if (A[i] == count) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
