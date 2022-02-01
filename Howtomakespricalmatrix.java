package com.Rishabh;

import java.util.Scanner;

public class Howtomakespricalmatrix {
    public static void main(String args[]) {
        System.out.println("Enter The Value For N:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] spiral = new int[n][n];
        int minCol = 0;
        int maxCol = n-1;
        int minRow = 0;
        int maxRow = n-1;

        while (n-->0&& n-->0) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = in.nextInt();
            }
            for (int i = minRow+1; i <= maxRow; i++) {
                spiral[i][maxCol] = in.nextInt();
            }
            for (int i = maxCol-1; i >= minCol; i--) {
                spiral[maxRow][i] = in.nextInt();
            }
            for (int i = maxRow-1; i >= minRow+1; i--) {
                spiral[i][minCol] = in.nextInt();
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
