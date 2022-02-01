package com.Rishabh;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChef12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextLong();
            }
            Arrays.sort(arr);
            long a = (arr[(n-1)]-arr[0])*arr[(n-2)];
            System.out.println(a);
        }
    }
}
