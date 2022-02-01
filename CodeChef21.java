package com.Rishabh;

import java.util.Scanner;

public class CodeChef21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
           int n = in.nextInt();
           int d = in.nextInt();
           if(d>23){
               System.out.println(n);
               continue;
           }
           long i = 1;
           int count = 0;
           while(d>0){
               if(count<10) {
                   long a = 2 * i;
                   i = a;
               }
               d--;
                   count++;
                   if(count>10){
                       i*=3;
                   }
           }
           if(i>n){
               i=n;
           }
            System.out.println(i);
        }
    }
}
