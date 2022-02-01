package com.Rishabh;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row,n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern7( int n ){
        for(int i=1;i<=n*2;i++){
            if(i%2 == 0) {
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else if(i == 1){
                System.out.println("*");
            }
        }
    }
    static void pattern6(int n){
        for(char i = 'A';i<'A'+n;i++){
            for(char j='A';j<'A'+n;j++){
                if(j<i) {
                    System.out.print(i);
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern11(int n) {
        if (n>0 && n<=200) {
            for (int row = 1; row <= n; row++) {
                // for every row, run the col
                //inner loop work for space
                for (int j = 2 * (n - row); j > 0; j--) {
                    //prints space between two stars
                    System.out.print(" ");
                }
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
                // when one row is printed, we need to add a newline
                System.out.println();
            }
        }
    }

    static void pattern1(int n) {
        if (n>0 && n<=200) {
            for (int row = 1; row <= n; row++) {
                // for every row, run the col
                for (int col = row; col <= n; col++) {
                    System.out.print("*");
                }
                // when one row is printed, we need to add a newline
                System.out.println();
            }
        }
    }
    static  void Pattern6(int n ){
    // put your code here
    int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.abs(j - i);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
