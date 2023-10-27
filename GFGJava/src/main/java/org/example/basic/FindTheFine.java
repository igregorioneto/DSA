package org.example.basic;

public class FindTheFine {
    public static void main(String[] args) {
        long N = 4, date = 12,car[] = {2375, 7682, 2325, 2352},fine[] = {250, 500, 350, 200};
        System.out.println(totalFine(N, date, car, fine));
    }

    static long totalFine(long n, long date, long car[], long fine[]) {
        long totalFine = 0;
        for (int i = 0; i < n; i++) {
            if (date % 2 == 0) {
                if (car[i] % 2 == 1) {
                    totalFine += fine[i];
                }
            } else {
                if (car[i] % 2 == 0) {
                    totalFine += fine[i];
                }
            }
        }
        return totalFine;
    }
}
