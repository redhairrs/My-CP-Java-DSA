package com.Rishabh;

import java.util.Scanner;

public class CodeChef9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            if(x1 == x2){
                System.out.println("Yes");
            }else if(y1 == y2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
