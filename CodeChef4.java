package com.Rishabh;

import java.util.Scanner;
import java.util.Arrays;

public class CodeChef4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();

            int[] arr = new int[n];
            int mx=0;
            int flag=0;
            for (int i = 0; i < n; i++)
            {
                arr[i] = in.nextInt();
                mx=Math.max(arr[i],mx);
            }


            for (int i = 0; i < n; i++)
            {
                if(arr[i] != mx)
                {
                    flag=1;
                    break;
                }
            }

            if(flag==0)
            {
                System.out.println("0");
            }
            else
            {
                if(arr[n-1]==mx)
                {
                    System.out.println("1");
                }
                else
                {
                    System.out.println("2");
                }
            }
        }
    }
}
