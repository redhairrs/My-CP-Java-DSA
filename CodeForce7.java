package com.Rishabh;

import java.util.Scanner;

public class CodeForce7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i]= in.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i] = in.nextInt();
            }
            for(int i=0;i<a.length;i++){
                    if(a[i]<=k && a[i] >0){
                        k+=b[i];
                        a[i]=-1;
                        i = -1;
                    }
                }
            System.out.println(k);
        }
    }
}
