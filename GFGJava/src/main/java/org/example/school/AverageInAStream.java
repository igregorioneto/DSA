package org.example.school;

public class AverageInAStream {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        for (float e:streamAvg(arr, 5)) {
            System.out.print(e + " ");
        }
    }

    static float[] streamAvg(int[] arr, int n) {
        float[] r = new float[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {//2
            sum += arr[i];
            r[i] = sum / (i + 1);
        }
        return r;
    }
}
