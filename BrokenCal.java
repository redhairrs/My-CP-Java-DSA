package com.Rishabh;

import java.util.Scanner;

public class BrokenCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int copy=n;
            int[] arr =new int[200];
            int i=0;
            while(copy > 0){
                int temp = copy%10;
                copy = copy/10;
                arr[i]=temp;
                i++;
            }
            int num;
            for (int j = 2; j < n; j++) {
                int temp=0;
                int index=0;
                for( index=0;index<i;index++) {
                    num = arr[index]*j+temp;
                    arr[index]=num%10;
                    temp=num/10;
                }
                while(temp > 0) {
                    arr[index]=temp%10;
                    temp=temp/10;
                    index++;
                    i++;
                }
            }
            for (int j = i-1; j >= 0; j--) {
                System.out.print(arr[j]);
            }
        }
    }
}
