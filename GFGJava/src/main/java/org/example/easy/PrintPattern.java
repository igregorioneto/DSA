package org.example.easy;

import java.util.ArrayList;
import java.util.List;

public class PrintPattern {
    public static void main(String[] args) {
        int N = 16;
        List<Integer> result = pattern(N);
        System.out.println(result);
    }

    static List<Integer> pattern(int N) {
        List<Integer> list = new ArrayList<>();

        patternRecursive(N, list);

        return list;
    }

    static void patternRecursive(int N, List<Integer> list) {
        list.add(N);
        if (N <= 0) return;
        patternRecursive(N - 5, list);
        list.add(N);
    }
}
