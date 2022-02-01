package com.Rishabh;

import java.util.Scanner;

public class CodeChef24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int a1 = in.nextInt();
            int b1 = in.nextInt();
            int a2 = in.nextInt();
            int b2 = in.nextInt();
            int a3 = in.nextInt();
            int b3 = in.nextInt();
            int a = a1+b1;
            int b = a2+b2;
            int c = a3+b3;
            int max1 = Math.max(a,b);
            int max2 = Math.max(max1,c);
            System.out.println(max2);
        }
    }
}
