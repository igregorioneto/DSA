package org.example.DSA.buscas;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Carregando os valores no array...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
            System.out.print(arr[i] + " ");
        }

        // Ordenando
        int posicao_menor, aux;
        for (int i = 0; i < arr.length; i++) {
            posicao_menor = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = arr[posicao_menor];
            arr[posicao_menor] = arr[i];
            arr[i] = aux;
        }

        System.out.println("\n\nOrdenando o array...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
