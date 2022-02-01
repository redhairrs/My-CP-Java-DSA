package com.Rishabh;
import java.util.Arrays;
import java.util.Scanner;
class Findamaxnumberinthematrix {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] array = new int[row][col];
        int max = Integer.MIN_VALUE;
        String coordinates = "";
        for (int i=0; i<array.length; i++){
            for (int j=0; j< array[i].length; j++){
                array[i][j] = in.nextInt();
                if (array[i][j] > max ){
                    max = array[i][j];
                    coordinates = String.format("%d %d", i, j);
                }
            }
        }

//        for(int i=0; i<array.length; i++){
//            System.out.println(Arrays.toString(array[i]));
//        }
//        System.out.println("");
        System.out.println(coordinates);
    }
}



