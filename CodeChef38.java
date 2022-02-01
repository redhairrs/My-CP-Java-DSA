package com.Rishabh;

import java.util.Scanner;

public class CodeChef38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            long j = 1;
            for(int i=0;i<n;j++,i++){
                if(i%2==0 && i>1)
                    j+=2;
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
