package com.Rishabh;

import java.util.Scanner;

public class CodeForce4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int  a = t%2;
        if(a == 0 && t != 2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
