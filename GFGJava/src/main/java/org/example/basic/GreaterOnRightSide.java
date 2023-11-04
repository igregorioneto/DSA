package org.example.basic;

public class GreaterOnRightSide {
    public static void main(String[] args) {
        int N = 4, Arr[] = {2, 3, 1, 9};
        nextGreatest(Arr, N);
        System.out.println();
        for (int e:Arr) {
            System.out.print(e + " ");
        }
    }

    static void nextGreatest(int arr[], int n) {
        int maxFromRight = -1;
        int[] result = new int[n];

        for (int i = n - 1 ; i >= 0 ; i--) {
            result[i] = maxFromRight;
            maxFromRight = Math.max(maxFromRight, arr[i]);
        }

        result[n - 1] = -1;

        System.arraycopy(result, 0, arr, 0, n);
    }

    static void nextGreatest2(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;
    }
}
