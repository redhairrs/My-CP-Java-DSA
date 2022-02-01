package com.Rishabh;

import java.util.Scanner;

public class CodeChef42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            if (x > k) {
                System.out.println(-1);
            } else {
                for (int i = 0; i <= x;) {
                    if( n == 0){
                        break;
                    }
                    if (i < x) {
                        System.out.print(i + " ");
                        i++;
                        n--;
                    } else if(x == i) {
                        i = 0;
                    }
                }
                System.out.println();
            }
        }
    }
}
