package org.example.basic;

import java.util.ArrayList;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        int N = 5, K = 77;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(35);
        arr.add(56);
        arr.add(48);
        arr.add(21);
        arr.add(87);

        reverseInGroups(arr, N, K);

        for (int i = 0; i < arr.size(); i++) {
           System.out.print(arr.get(i) + " ");
        }
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
            int start = i;
            int end = Math.min(n - 1, i + k - 1);
            while (start < end) {
                int temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end, temp);

                start++;
                end--;
            }
        }
    }

    static void reverseInGroups2(ArrayList<Integer> arr, int n, int k) {
        // Identificar se existe o valor de K no array - FEITO
        // Se não existir inverter o array completo - FEITO
        // Se existir dividir o valor até o K e separar em dois grupos - FEITO
        // Caso separe em dois grupos inverter os valores. - FEITO
        String r1 = "", r2 = "";
        boolean exists = false;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                exists = true;
                index = i;
                break;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (!exists) {
                r1 += arr.get(i);
            } else {
                if (i <= index) {
                    r1 += arr.get(i);
                } else {
                    r2 += arr.get(i);
                }
            }
        }
        System.out.print(r1 + " " + r2);

        r1 = new StringBuilder(String.valueOf(r1)).reverse().toString();
        r2 = new StringBuilder(String.valueOf(r2)).reverse().toString();
        r1 += r2;

        arr.clear();
        //for (int i = 0; i < r1.length(); i++) {
        //    arr.add(Character.getNumericValue(r1.charAt(i)));
        //}
    }
}
