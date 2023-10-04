package org.example.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortV2 {
    public static void main(String[] args) {
        int X[] = new int[5];
        int n, i, aux, troca;
        Scanner entrada = new Scanner(System.in);
        for (i = 0; i <= 4 ; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            X[i] = entrada.nextInt();
        }

        // Bubble Sort V2
        n = 1;
        troca = 1;
        while (n <= 5 && troca == 1) {
            troca = 0;
            for (i = 0; i <= 3 ; i++) {
                if (X[i] < X[i + 1]) {
                    troca = 1;
                    aux = X[i];
                    X[i] = X[i + 1];
                    X[i + 1] = aux;
                }
            }
            n += 1;
        }

        // Organizando de forma crescente.
        Arrays.sort(X);

        for (i = 0; i <= 4 ; i++) {
            System.out.println((i + 1) + " número: " + X[i]);
        }
    }
}
