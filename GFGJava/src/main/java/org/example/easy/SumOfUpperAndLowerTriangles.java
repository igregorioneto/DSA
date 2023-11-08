package org.example.easy;

import java.util.ArrayList;

public class SumOfUpperAndLowerTriangles {
    public static void main(String[] args) {
        int N = 3,
        mat[][] = {{6, 5, 4},
            {1, 2, 5},
            {7, 9, 7}};
        System.out.println();
        for (Integer e:sumTriangles(mat, N)) {
            System.out.print(e + " ");
        }
    }

    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        int sumUpper = 0, sumLower = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Both
                if (i == j) {
                    sumUpper += matrix[i][j];
                    sumLower += matrix[i][j];
                }
                // Upper and Lower
                if (i < j) {
                    sumUpper += matrix[i][j];
                } else if (i > j){
                    sumLower += matrix[i][j];
                }
            }
        }
        ArrayList arr = new ArrayList();
        arr.add(sumUpper);
        arr.add(sumLower);
        return arr;
    }
}
