package org.example.basic;

public class ProductOfArrayElements {
    public static void main(String[] args) {
        int n = 1;
        Long mod = 4L, arr[] = {1L ,2L ,3L ,4L};
        System.out.print(product(arr, mod, n));
    }

    static Long product(Long arr[], Long mod, int n) {
        long r = 1;
        for (int i = 0; i < n; i++) {
            r = r * arr[i] % mod;
        }
        return r;
    }
}
