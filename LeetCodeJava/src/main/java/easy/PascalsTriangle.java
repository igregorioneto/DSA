package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        for (List<Integer> e:generate(5)) {
            System.out.print(Arrays.toString(e.toArray()));
        }
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {// i = 2
            int sum = 1;
            for (int j = 0; j <= i ; j++) {
                if (j == 0 || j == i) {
                    resultado.add(1);
                } else {
                    sum = arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1);
                    resultado.add(sum);
                }
            }
            System.out.println();
            arr.add(resultado);
            resultado = new ArrayList<>();
        }
        return arr;
    }
}
