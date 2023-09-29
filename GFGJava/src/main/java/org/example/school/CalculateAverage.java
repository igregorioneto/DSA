package org.example.school;

import java.text.DecimalFormat;

public class CalculateAverage {
    public static void main(String[] args) {
        int A[] = {1 ,2 ,3 ,4 ,5};
        System.out.print(average(A, 5));
    }

    public static String average(int A[], int N) {
        double sum = 0;
        for(int e: A) sum += e;
        double average = (sum/N);
        return String.format("%.2f",average);
    }
}
