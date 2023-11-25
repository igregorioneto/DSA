package org.example.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortInSpecificOrder {
    public static void main(String[] args) {
        long N = 7,
        Arr[] = {1, 2, 3, 5, 4, 7, 10};

        sortIt(Arr, N);

        for (long e:Arr) {
            System.out.print(e + " ");
        }
    }

    static void sortIt(long arr[], long n) {
        List<Long> a = new ArrayList<>(), b = new ArrayList<>();

        for (long e:arr) {
            if (e % 2 == 0) {
                b.add(e);
            } else {
                a.add(e);
            }
        }

        Collections.sort(a,Collections.reverseOrder());
        Collections.sort(b);

        a.addAll(b);

        for (int i = 0; i < n; i++) {
            arr[i] = a.get(i);
        }
    }

    static void sortIt2(long arr[], long n) {
        List<Long> a = new ArrayList<>(), b = new ArrayList<>(), c = new ArrayList<>();

        for (long e:arr) {
            if (e % 2 == 0) {
                b.add(e);
            } else {
                a.add(e);
            }
        }

        Collections.sort(a,Collections.reverseOrder());
        Collections.sort(b);

        for (long e:a) {
            c.add(e);
        }
        for (long e:b) {
            c.add(e);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = c.get(i);
        }
    }
}
