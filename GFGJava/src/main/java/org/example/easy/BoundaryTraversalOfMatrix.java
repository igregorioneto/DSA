package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversalOfMatrix {
    public static void main(String[] args) {
        int matrix[][] =   {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
        for (int e:boundaryTraversal(matrix,4,4)) {
            System.out.print(e + " ");
        }
    }

    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) arr.add(matrix[0][i]);
        for (int i = 1; i < n; i++) arr.add(matrix[i][m - 1]);
        if (n > 1) for (int i = m - 2; i >= 0 ; i--) arr.add(matrix[n - 1][i]);
        if (m > 1) for (int i = n - 2; i > 0 ; i--) arr.add(matrix[i][0]);

        return arr;
    }

    static ArrayList<Integer> boundaryTraversal2(int matrix[][], int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        int countJReverse = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0) {
                    arr.add(matrix[i][j]);
                } else if (i == n - 1) {
                    arr.add(matrix[i][m - countJReverse]);
                    countJReverse++;
                } else if (i > 0 && i < n - 1 && j == m - 1) {
                    arr.add(matrix[i][j]);
                }
            }
        }

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < m; j++) {
                if (i > 0 && i < n - 1 && j == 0) {
                    arr.add(matrix[i][j]);
                }
            }
        }
        return arr;
    }
}
