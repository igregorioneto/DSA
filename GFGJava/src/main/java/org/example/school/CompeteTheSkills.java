package org.example.school;

public class CompeteTheSkills {
    public static void main(String[] args) {
        long[] A = {1804289384, 846930887 ,1681692778};
        long[] B = {1714636916, 1957747794 ,424238336};
        scores(A, B);
    }

    public static void scores(long a[], long b[]) {
        long countA = 0;
        long countB = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) countA++;
            if (b[i] > a[i]) countB++;
        }
        System.out.print(countA + " " + countB);
    }
}
