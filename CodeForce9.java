package com.Rishabh;

import java.util.Scanner;

public class CodeForce9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String z = in.nextLine();
        while(t-->0) {
            String s = in.nextLine();
            int count1 =0;
            int count2 =0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    count1++;
                }else {
                    count2++;
                }
            }
            if(count1 == count2){
                System.out.println(count1-1);
            }else if(count1>count2){
                System.out.println(count2);
            }else{
                System.out.println(count1);
            }
        }
    }
}
