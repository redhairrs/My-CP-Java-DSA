package com.Rishabh;

import java.util.Scanner;

public class CodeChef8 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            if(n==2){
                System.out.println(1);
                continue;
            }
            n--;

            int count=2;

            for (int i=2; i<=Math.sqrt(n); i++)
            {
                if (n%i == 0)
                {
                    if (n/i == i)
                        count++;

                    else
                        count+=2;
                }
            }
            System.out.println(count);
        }
    }
}
