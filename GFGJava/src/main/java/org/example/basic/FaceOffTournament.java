package org.example.basic;

public class FaceOffTournament {
    public static void main(String[] args) {
        int x = 6, m = 5, n = 3;
        long arr[] = {1, 9, 9, 10, 9, 18};
        System.out.println(winner(x, m, n, arr));
    }

    static String winner(int x, int m, int n, long arr[]) {
        int pointsRam = 0, pointsRohan = 0;
        for (int i = 0; i < x; i++) {
            if (arr[i] % m == 0) pointsRam++;
            else if (arr[i] % n == 0) pointsRohan++;
        }

        if (pointsRam > pointsRohan)
            return "Ram";
        else if (pointsRohan > pointsRam)
            return "Rohan";
        else
            return "Both";
    }
}
