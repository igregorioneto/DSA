package org.example.DSA.buscas;

public class Recursividade {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Gerando valores no array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
            System.out.print(arr[i] + " ");
        }

        // Recursividade
        System.out.println("Somando com Recursividade");
        System.out.println(soma(0,0,arr));
    }

    static int soma(int soma, int posicao, int[] arr) {
        if (posicao < arr.length) {
            soma = soma + arr[posicao];
            return soma(soma, posicao + 1, arr);
        } else {
            return soma;
        }
    }
}
