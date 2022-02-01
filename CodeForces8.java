package com.Rishabh;

import java.util.Scanner;

public class CodeForces8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int l = in.nextInt();
            int r = in.nextInt();
            int k = in.nextInt();
            r++;
            int diff=r-l;
            if(diff%2==1){
                if(diff==1){
                    if(l==1)
                        System.out.println("NO");
                    else
                        System.out.println("YES");
                }
                else{
                    if(l%2==1){
                        if((diff+1)/2<=k)
                            System.out.println("YES");
                        else
                            System.out.println("NO");
                    }
                    else{
                        if((diff)/2<=k)
                            System.out.println("YES");
                        else
                            System.out.println("NO");
                    }
                }
            }
            else{
                if((diff)/2<=k)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
