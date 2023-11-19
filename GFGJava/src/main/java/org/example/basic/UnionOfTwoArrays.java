package org.example.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println("Teste 1: ");
        int n = 5, m = 3,
                a[] = {1 ,2 ,3 ,4 ,5},
                b[] = {1 ,2 ,3};
        System.out.println(doUnion(a,n,b,m));

        System.out.println("Teste 2: ");
        int f = 6, g = 2,
                c[] = {85 ,25, 1, 32, 54, 6},
                d[] = {85 ,2};
        System.out.println(doUnion(c,f,d,g));
    }

    static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> r = new HashSet<>();
        for (int i = 0; i < n; i++) {
            r.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            r.add(b[i]);
        }

        return r.size();
    }

    static int doUnion2(int a[], int n, int b[], int m) {
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!r.contains(a[i])) {
                r.add(a[i]);
            }
        }

        for (int i = 0; i < m; i++) {
            if (!r.contains(b[i])) {
                r.add(b[i]);
            }
        }

        return r.size();
    }
}
