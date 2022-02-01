package com.Rishabh;

import java.util.ArrayList;
import java.util.Arrays;

public class flipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0},

        };
        System.out.println(Arrays.deepToString(flipAndInvert(image)));
    }
    static int[][] flipAndInvert(int[][] image){
        for(int[] row: image){
            for(int i=0;i<(image[0].length+1)/2;i++){
                int temp = row[i];
                 row[i] = row[image[0].length-i-1];
                 row[image[0].length-i-1] = temp;
            }

        }
        for(int[] row: image){
            for(int i=0;i<image[0].length;i++){
                row[i] = row[i]^1;
            }
        }
        return image;
    }
}
