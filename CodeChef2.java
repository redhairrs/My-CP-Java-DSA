package com.Rishabh;

import java.util.Scanner;

public class CodeChef2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            if (n % 2 == 1) {
                System.out.println("-1");
            } else {
                int[] arr = new int[n];
                for (int i = 0,j = n-1; i < n/2; i++,j--)
                {
                    arr[i]=0;
                    arr[j]=1;
                }

                for (int i = 0; i < n; i++)
                {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
        }
    }
}
