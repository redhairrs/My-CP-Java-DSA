package com.Rishabh;

import java.util.Scanner;

public class CodeChef28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int dsad = in.nextInt();
            int tocd = in.nextInt();
            int dmd = in.nextInt();
            int dsas = in.nextInt();
            int tocs = in.nextInt();
            int dms = in.nextInt();
            if (dsad+tocd+dmd > dsas+tocs+dms) {
                System.out.println("DRAGON");
            }else if(dsad+tocd+dmd < dsas+tocs+dms){
                System.out.println("SLOTH");
            } else {
                if (dsad > dsas) {
                    System.out.println("DRAGON");
                } else if (dsad < dsas) {
                    System.out.println("SLOTH");
                } else  {
                    if (tocd > tocs) {
                        System.out.println("DRAGON");
                    } else if (tocd < tocs) {
                        System.out.println("SLOTH");
                    }else{
                            System.out.println("TLE");
                    }
                }
            }
        }
    }
}
