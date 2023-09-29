package org.example.school;

public class PrintThePattern {
    public static void main(String[] args) {
        int n = 3;
        printPat(3);
    }

    static void printPat(int n) {
        for (int i = n; i > 0 ; i--) {//2
            for (int j = n; j > 0 ; j--) {//3
                for (int k = 0; k < i ; k++) {//0
                    System.out.print(j + " ");//333222111
                }
            }
            System.out.print("$");//$
        }
    }
}
