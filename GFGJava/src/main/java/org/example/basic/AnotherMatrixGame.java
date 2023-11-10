package org.example.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnotherMatrixGame {
    public static void main(String[] args) {
        String S = "adgkbdhlceilcfjm";
        System.out.println(matrixGame(S));
    }

    static String matrixGame(String S) {
        StringBuilder ans = new StringBuilder();
        int n = (int) Math.sqrt(S.length());
        char[][] mat = new char[n][n];
        int k = 0;

        // Preencher a matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = S.charAt(k);
                k += 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            StringBuilder s = new StringBuilder();

            // Contar a frequência de cada caractere na coluna
            for (int j = 0; j < n; j++) {
                freq[mat[j][i] - 'a'] += 1;
            }

            // Construir a string s contendo os caracteres únicos
            for (int j = 0; j < n; j++) {
                if (freq[mat[j][i] - 'a'] == 1) {
                    s.append(mat[j][i]);
                }
            }

            // Construir a string ans invertendo-a em posições ímpares
            if (s.length() % 2 == 1) {
                for (int j = 0; j < s.length() / 2; j++) {
                    ans.append(s.charAt(j));
                    ans.append(s.charAt(s.length() - j - 1));
                }
                ans.append(s.charAt(s.length() / 2));
            } else {
                for (int j = 0; j < s.length() / 2; j++) {
                    ans.append(s.charAt(j));
                    ans.append(s.charAt(s.length() - j - 1));
                }
            }
        }

        if (ans.length() == 0) {
            ans.append('0');
        }

        return ans.toString();
    }

    static String orderColumn(char[][] matrix, int coluna) {
        char[] colunaArray = new char[matrix.length];

        // Copiar a coluna para um array
        for (int i = 0; i < matrix.length; i++) {
            colunaArray[i] = matrix[i][coluna];
        }

        // Ordenar o array coluna-wise
        Arrays.sort(colunaArray);

        // Construir a string no formato desejado (azbycxdw....)
        StringBuilder resultadoColuna = new StringBuilder();
        boolean inverter = false;
        for (int i = 0; i < matrix.length; i++) {
            resultadoColuna.append((inverter) ? colunaArray[i] : colunaArray[colunaArray.length - i - 1]);
            inverter = !inverter;
        }

        return resultadoColuna.toString();
    }

    static void removeValuesColumn(char[][] arr, int column) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i][column];
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            } else {
                arr[i][column] = '0';
            }
        }
    }
}
