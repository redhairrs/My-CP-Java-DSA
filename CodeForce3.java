package com.Rishabh;

import java.util.Scanner;

public class CodeForce3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n,m,rb,cb,rd,cd;
            int output1,output2;
                n=in.nextInt();m=in.nextInt();rb=in.nextInt();cb=in.nextInt();rd=in.nextInt();cd=in.nextInt();
                if(rb>rd)
                    output1=n-rb+n-rd;
                else
                    output1=rd-rb;
                if(cb>cd)
                    output2=m-cb+m-cd;
                else
                    output2=cd-cb;
            System.out.println(Math.min(output2,output1));
        }
    }
}
