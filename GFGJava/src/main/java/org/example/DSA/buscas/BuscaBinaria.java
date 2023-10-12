package org.example.DSA.buscas;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\n");
        int buscado = 3;
        int inicio = 0;
        int fim = arr.length - 1;
        int meio;
        boolean achou = false;
        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            if (arr[meio] == buscado) {
                achou = true;
                break;
            } else if (arr[meio] < buscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        String msg = achou ? "Achou" : "Não Achou";
        System.out.println(msg);
    }
}
