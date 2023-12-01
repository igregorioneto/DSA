package org.example.codingame.power_of_thor;

import java.util.Scanner;

public class PowerOfThorEpidose1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        int tX = initialTx;
        int tY = initialTy;
        String dir = "";

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            if ((tY == lightY)) {
                // O Thor vai poder poder andar para E e W
                if (tX < lightX) {
                    tX++;
                    dir = "E";
                }
                if (tX > lightX) {
                    tX--;
                    dir = "W";
                }
            } else if ((tX == lightX)) {
                // O Thor vai poder poder andar para N e S
                if (tY < lightY) {
                    tY++;
                    dir = "S";
                }
                if (tY > lightY) {
                    tY--;
                    dir = "N";
                }
            } else if (lightY >= tY && lightX < tX) {
                tY++;
                tX--;
                dir = "SW";
            } else if (lightY <= tY && lightX < tX) {
                tY--;
                tX--;
                dir = "NW";
            } else if (lightY <= tY && lightX > tX) {
                tY--;
                tX++;
                dir = "NE";
            } else if (lightY >= tY && lightX > tX) {
                tY++;
                tX++;
                dir = "SE";
            }

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(dir);
        }
    }
}
