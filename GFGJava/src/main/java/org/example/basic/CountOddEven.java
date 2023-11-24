package org.example.basic;

public class CountOddEven {
    public static void main(String[] args) {
        int N = 5,
        A[] = {1 ,2 ,3 ,4 ,5};
        countOddEven(A, N);
    }

    static void countOddEven(int[] arr, int n) {
        int countOdd = 0, countEven = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(countOdd + " " + countEven);
    }
}
