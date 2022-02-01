package com.Rishabh;

import java.util.Scanner;

public class CodeChef18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int N = in.nextInt();
            int r = in.nextInt();
            int c = in.nextInt();
            if((r-c)%2==0){
                System.out.println(0);
            }else {
                System.out.println(1);
            }
        }
    }
}
