package com.Rishabh;

import java.util.Scanner;

public class CodeChef5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-->0){
            int n = in.nextInt();
            int c1 = 0;
            int c2 = 0;
            int arr;
            for(int i = 0;i<n;i++ ){
                arr= in.nextInt();
                if(arr%3 == 1 ) {
                    c1++;
                }else if(arr%3 == 2){
                    c2++;
                }
            }
            int a =  Math.abs(c1-c2);
            int b = Math.min(c1,c2);
            double c = (double)b+(double)(2*a)/(3.0);

            if(Math.floor(c) != Math.ceil(c)){
                System.out.println(-1);
            }else {
                System.out.println((int)c);
            }
        }
    }
}
