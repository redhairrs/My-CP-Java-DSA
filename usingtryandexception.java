package com.Rishabh;

import java.util.*;


public class usingtryandexception {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t = in.nextInt();
        while(t-->0){
            try {
                long x = in.nextLong();
                System.out.println(x + " can be fitted in:");
                if (-128 < x && 127 > x) {
                    System.out.println("* short");
                }
                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                    String a = in.next();
                    System.out.println(a + " can't be fitted anywhere.");
            }
        }
        in.close();
    }
}

