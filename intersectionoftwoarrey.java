package com.Rishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class intersectionoftwoarrey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        a=in.nextInt();b=in.nextInt();
        int[] a1 = new int[a];
        int[] a2 = new int[b];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<a;i++)
        {
            a1[i]=in.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            a2[i]=in.nextInt();
        }
        int rishu=0;
        // int ans[100000];
        // int k=0;
        Arrays.sort(a2);
        Arrays.sort(a1);
        for(int i=0;i<b;i++)
        {
            for(int j=rishu;j<a;j++)
            {
                if(a2[i]==a1[j])
                {
                    list.add(a2[i]);
                    rishu =j+1;
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
