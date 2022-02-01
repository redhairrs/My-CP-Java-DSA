package com.Rishabh;

import java.util.Scanner;

public class CodeChef26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int a = in.nextInt();
            if(n == 1){
                if(a%2 == 1) {
                    System.out.println("Odd");
                }else if(a%2 == 0){
                    System.out.println("Even");
                }
                continue;
            }
            if(a%2 == 1){
                if(n%2==1){
                    System.out.println("Odd");
                }else if(n%2==0){
                    System.out.println("Even");
                }
            }else{
                System.out.println("Impossible");
            }
        }
    }
}
