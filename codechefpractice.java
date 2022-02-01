package com.Rishabh;

import java.util.Objects;
import java.util.Scanner;

public class codechefpractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int flag = 0;
            int n = in.nextInt();
            int[] str = new int[n];
            for (int i = 0; i < n; i++) {
                str[i] = in.nextInt();
            }
            if(str[0] != 1){
                flag = 1;
            }

            int i = 0;
            int j = n-1;

            while(i<j){

                if(str[i] != str[j]){
                    flag = 1;
                    break;
                }
                if (str[i] != str[i+1] && str[i+1]-str[i]>1) {
                    flag = 1;
                    break;
                }
                i++;
                j--;
            }

            if(str[i] != 7){
                flag = 1;
            }
            if( flag == 0){
                System.out.println("yes");
            }else if (flag == 1){
                System.out.println("no");
            }
        }
    }
}