package com.Rishabh;

import java.util.Scanner;

public class CodeChef6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-->0){
            int n = in.nextInt();
            for(int i=0;i<=n;i++){
                System.out.println(2*i-1);
            }
        }
    }
}
