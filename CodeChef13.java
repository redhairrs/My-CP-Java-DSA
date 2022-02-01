package com.Rishabh;

import java.util.Scanner;

public class CodeChef13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            if(n<3){
                System.out.println(0);
            }else{
                System.out.println(10*(n-2)*(int)Math.pow(3,(n-3)));
            }
        }
    }
}
