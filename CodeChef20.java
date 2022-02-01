package com.Rishabh;

import java.util.Scanner;

public class CodeChef20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            double t1 = in.nextInt();
            double t2 = in.nextInt();
            double r1 = in.nextInt();
            double r2 = in.nextInt();
            double a =(Math.pow(t1,2)/Math.pow(r1,3));
            double b =(Math.pow(t2,2)/Math.pow(r2,3));
            if(a == b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
