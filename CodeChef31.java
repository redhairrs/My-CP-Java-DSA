package com.Rishabh;

import java.util.Scanner;

public class CodeChef31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum1=0;int sum2=0;
        while(t-->0) {
            int n = in.nextInt();
            int[][] arr = new int[3][3];
            for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                }
            }
            sum1 = arr[0][1]+arr[0][2]+arr[1][2];
            sum2 = arr[1][0]+arr[2][0]+arr[2][1];
            int max = Math.max(sum1,sum2);
            System.out.println(sum1);
        }
    }
}
