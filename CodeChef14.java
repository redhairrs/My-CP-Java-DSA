package com.Rishabh;

import java.util.Scanner;

public class CodeChef14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int N,last,ansCount,i;
            String input1,input2;
                N = in.nextInt();
            String z = in.nextLine();
                input1=in.nextLine();input2=in.nextLine();
                ansCount=0;
                last=-1;
                for(i=0;i<input1.length();i++){
                    if(input1.charAt(i)<input2.charAt(i)){
                        ansCount+=i-last;
                        last=i;
                    }else if(input1.charAt(i)>input2.charAt(i)) {
                        last = i;
                    }
                }
                System.out.println(ansCount);
            }
    }
}
