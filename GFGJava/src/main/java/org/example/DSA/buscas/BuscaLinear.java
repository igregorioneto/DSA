package org.example.DSA.buscas;

public class BuscaLinear {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\n");
        int buscado = 8;
        boolean achou = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == buscado) {
                achou = true;
                break;
            }
        }

        String msg = achou ? "Achou" : "Não achou";
        System.out.println(msg);

    }
}
