package com.Rishabh;

import java.util.Scanner;

public class CodeChef17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int nr = in.nextInt();
            int mt = in.nextInt();

            if(nr%2 == 0 && mt%2==0){
                int a = nr/2;
                int b = mt/2;
            System.out.println(a*b);
            }
            else if(nr%2==0){
                int a = nr/2;
                int b = mt/2+1;
                System.out.println(a*b);
            }
            else if(mt%2==0){
                int a = nr/2+1;
                int b = mt/2;
                System.out.println(a*b);
            }
            else{
                int aaa = nr/2+1;
                int bbb = mt/2+1;
                System.out.println(aaa*bbb);
            }
        }
    }
}
