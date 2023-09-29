package org.example.school;

public class SmallerAndLarger {
    public static void main(String[] args) {
        int arr[] = {3 ,3 ,3};
        for (int e:getMoreAndLess(arr, 3, 3)) {
            System.out.print(e + " ");
        }
    }

    public static int[] getMoreAndLess(int[] arr, int n, int x) {
        int countLess = 0;
        int countGreater = 0;
        for (int e:arr) {
            if (e <= x) countLess++; if(e >= x) countGreater++;
        }
        return new int[]{countLess, countGreater};
    }
}
