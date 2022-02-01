package com.Rishabh;

import java.util.Arrays;

class ArrayOperations {
    public static void main(String[] args) {
        createCube();
    }
    static int[][][]  createCube() {
        int[][][] threeDimArray = new int[3][3][3];
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = j * 3 + k;
                }
            }
        }
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
            }
            System.out.println();
        }
        return threeDimArray;
    }
}