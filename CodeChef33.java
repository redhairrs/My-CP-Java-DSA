package com.Rishabh;

import java.util.Scanner;

public class CodeChef33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a>b && a>c ){
                if(a>50){
                    System.out.println("A");
                }else{
                    System.out.println("NOTA");
                }
            }else if (b>a && b>c) {
                if(b>50){
                    System.out.println("B");
                }else{
                    System.out.println("NOTA");
                }
            }else{
                if(c>50){
                    System.out.println("C");
                }else{
                    System.out.println("NOTA");
                }
            }
        }
    }
}
