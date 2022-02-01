package com.Rishabh;

import java.util.Scanner;

public class CodeChef35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int k = in.nextInt();
            int count = 0;
            while(k>=0){
                if(k%2 == 0){
                    count++;
                    k /=2;
                }else{
                    break;
                }

            }
            System.out.println(count);
        }
    }
}
