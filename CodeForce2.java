package com.Rishabh;

import java.util.Scanner;
import java.lang.*;
public class CodeForce2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int a = in.nextInt();
            int b =(int) Math.sqrt(a);
            int c =(int) Math.cbrt(a);
            int d = (int)Math.sqrt(Math.cbrt(a));
            int e = (b + c) - d ;
            System.out.println(e);
        }
    }
}
