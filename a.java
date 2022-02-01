package com.Rishabh;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0) {
            int n = in.nextInt();
            String z  =in.nextLine();
            String s = in.nextLine();
            if(n>2){
                System.out.println("No");
                continue;
            }
            if(n == 2){
                if(s.charAt(0) == s.charAt(1)){
                    System.out.println("No");
                }else {
                    System.out.println("Yes");
                }
            }
            if(n<2){
                System.out.println("Yes");
            }
        }
    }
}
