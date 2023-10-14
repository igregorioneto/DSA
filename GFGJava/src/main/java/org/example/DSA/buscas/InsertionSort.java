package org.example.DSA.buscas;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * arr.length);
            System.out.print(arr[i] + " ");
        }

        int aux, j;
        for (int i = 1; i < arr.length; i++) {
            aux = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > aux) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = aux;
        }

        System.out.print("\n\n\n\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
