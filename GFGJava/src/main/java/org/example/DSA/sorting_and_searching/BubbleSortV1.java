package org.example.DSA.sorting_and_searching;

import java.util.Scanner;

public class BubbleSortV1 {
    public static void main(String[] args) {
        int X[] = new int[5];
        int j, i, aux;
        Scanner entrada = new Scanner(System.in);
        for (i = 0; i <= 4 ; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            X[i] = entrada.nextInt();
        }

        // Bubble Sort V1
        for (j = 1; j <= 4 ; j++) {
            for (i = 4; i >= j; i --) {
                if (X[i] < X[i - 1]) {
                    aux = X[i];
                    X[i] = X[i - 1];
                    X[i - 1] = aux;
                }
            }
        }

        for (i = 0; i <= 4 ; i++) {
            System.out.println((i + 1) + " número: " + X[i]);
        }
    }
}
