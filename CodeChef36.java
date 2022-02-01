package com.Rishabh;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeChef36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n  = in.nextInt();
            int count = 0;
            for(int i=1;i<Math.pow(2,20);i++){
                if(Integer.bitCount(i)%2 == 0) {
                    count++;
                    System.out.print(i+" ");
                    if(count == n){
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
