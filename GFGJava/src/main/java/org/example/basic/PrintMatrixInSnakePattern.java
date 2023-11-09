package org.example.basic;

import java.util.ArrayList;

public class PrintMatrixInSnakePattern {
    public static void main(String[] args) {
        int N = 3,
        matrix[][] = {{45, 48, 54},
            {21, 89, 87},
            {70, 78, 15}};

        for (Integer e:snakePattern(matrix)) {
            System.out.print(e + " ");
        }
    }

    static ArrayList<Integer> snakePattern(int matrix[][]) {
        int n = matrix.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr.add(matrix[i][j]);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr.add(matrix[i][j]);
                }
            }
        }
        return arr;
    }
}
