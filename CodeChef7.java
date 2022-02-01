package com.Rishabh;

import java.util.Scanner;
import java.util.Arrays;
public class CodeChef7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i]= in.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[n/2]-arr[n/2-1]);
        }
    }
}
