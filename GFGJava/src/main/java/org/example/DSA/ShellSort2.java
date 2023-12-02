package org.example.DSA;

public class ShellSort2 {
    public static void main(String[] args) {
        int[]arr = {12,34,54,2,3};
        System.out.println("Array original:");
        printArray(arr);

        shellSort(arr);

        System.out.println("\nArray ordenado:");
        printArray(arr);
    }

    static void shellSort(int[] arr) {
        int n = arr.length;

        // Inicia o Gap com a metade do valor do array
        for (int gap = n / 2; gap > 0 ; gap/=2) {
            // Aplica o algoritmo de ordenação por inserção
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp ; j-= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
