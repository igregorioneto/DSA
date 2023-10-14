package org.example.DSA.buscas;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * arr.length);
            System.out.print(arr[i] + " ");
        }

        int aux;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    aux = arr[j];
                    arr[j] = arr[i];
                    arr[i] = aux;
                }
            }
        }

        System.out.print("\n\n\n\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
