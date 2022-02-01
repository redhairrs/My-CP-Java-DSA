package com.Rishabh;

import java.util.Scanner;

public class CodeForces9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            if(n%7==0){
                System.out.println(n);
                continue;
            }
            int x= n/7;
            int p = (x+1)*7;
            int m = (x)*7;
            if(p/10==n/10) {
                System.out.println(p);
            }
            else{
                System.out.println(m);
            }
        }
    }
}
