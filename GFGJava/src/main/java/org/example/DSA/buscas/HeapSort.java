package org.example.DSA.buscas;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Criando o array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * arr.length);
            System.out.print(arr[i] + " ");
        }

        /*
        * Heap Sort -> Com base em conceito de Arvore Binária
        * */
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0 ; i--) {
            aplicarHeap(arr, n, i);
        }

        /*
        * Depois de aplicar o Heap Sort...
        * */
        System.out.println("\n\nQuase ordenação");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        /*
        * Ordenação...
        * */
        for (int i = n - 1; i > 0 ; i--) {
            int aux = arr[0];
            arr[0] = arr[i];
            arr[i] = aux;

            aplicarHeap(arr, i, 0);
        }

        System.out.println("\n\nOrdenação");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void aplicarHeap(int[] arr, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && arr[esquerda] > arr[raiz]) {
            raiz = esquerda;
        }

        if (direita < n && arr[direita] > arr[raiz]) {
            raiz = direita;
        }

        if (raiz != i) {
            int aux = arr[i];
            arr[i] = arr[raiz];
            arr[raiz] = aux;

            aplicarHeap(arr, n, raiz);
        }
    }
}
