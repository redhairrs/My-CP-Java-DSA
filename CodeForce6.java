package com.Rishabh;

import java.util.Scanner;

public class CodeForce6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();int b = in.nextInt();int c = in.nextInt();double multi;
            boolean flag1 = false;boolean flag2 = false;boolean flag3 = false;
            multi=a+2*(b-a);
            if(multi>=c && (int)multi%c==0)
                flag1=true;
            multi=c-2*(c-b);
            if(multi>=a && (int)multi%a==0)
                flag2=true;
            multi=(double)(c+a)/2;
            if(Math.floor(multi)==Math.ceil(multi)){
                if(multi>=b && (int)multi%b==0)
                    flag3=true;
            }
            if(flag1 || flag2 || flag3){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
