package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(Arrays.toString(getRow(rowIndex).toArray()));
    }

    static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> resultado = new ArrayList<>();


        for (int i = 0; i <= 33; i++) {
            int sum = 1;
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    resultado.add(1);
                } else {
                    sum = arr.get(i - 1).get(j) + arr.get(i - 1).get(j - 1);
                    resultado.add(sum);
                }
            }
            arr.add(resultado);
            resultado = new ArrayList<>();
        }

        resultado = arr.get(rowIndex);

        return resultado;
    }
}
