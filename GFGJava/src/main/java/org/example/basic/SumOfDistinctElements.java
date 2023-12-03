package org.example.basic;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class SumOfDistinctElements {
    public static void main(String[] args) {
        int N = 5,
        Arr[] = {5, 5, 5, 5, 5};
        System.out.println(findSum(Arr, N));
    }

    static int findSum(int arr[], int n) {
        int sum = 0;
        TreeSet<Integer> map = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            map.add(arr[i]);
        }

        for (Integer e:map) {
            sum += e;
        }

        return sum;
    }
}
