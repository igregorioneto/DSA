package org.example.easy;

public class ConvertArrayIntoZigZagFashion {
    public static void main(String[] args) {
        int N = 7,
        Arr[] = {4, 3, 7, 8, 6, 2, 1};
        System.out.println("Antes da modificação...");
        for (int e:Arr) {
            System.out.print(e + " ");
        }

        zigZag(Arr, N);
        System.out.println();

        System.out.println("Depois da modificação...");
        for (int e:Arr) {
            System.out.print(e + " ");
        }
    }

    static void zigZag(int a[], int n) {
        for (int i = 0; i < a.length - 1; i++) {
            if (i % 2 == 0 && a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            } else if (i % 2 == 1 && a[i] < a[i + 1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }
}
