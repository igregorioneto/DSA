package org.example.DSA;

public class LinearSearch {
    public static void main(String[] args) {
        String arr[] = {"A","B","C","D","E","F","G","H","I", "J"};
        String elemento = "M";

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(elemento)) {
                found = true;
                break;
            }
        }

        if (found) System.out.print("Achou"); else System.out.print("Não achou!");

    }
}
