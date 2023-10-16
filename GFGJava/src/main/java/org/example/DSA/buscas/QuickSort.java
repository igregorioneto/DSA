package org.example.DSA.buscas;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Criando o array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * arr.length);
            System.out.print(arr[i] + " ");
        }

        quicksort(arr, 0, arr.length - 1);

        System.out.println("\n\nOrdenando...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quicksort(int[] arr, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(arr, esquerda, direita);
            quicksort(arr, esquerda, p);
            quicksort(arr, p + 1, direita);
        }
    }

    private static int particao(int[] arr, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivot = arr[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) {
                return j;
            }
            int aux = arr[i];
            arr[i] = arr[j];
            arr[j] = aux;
        }
    }
}
