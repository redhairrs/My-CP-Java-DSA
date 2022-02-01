package com.Rishabh;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeChef29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int cum1 = 0;int cum2 = 0;
        int max1= 0;int max2 = 0;
        while(t-->0) {
            int a = in.nextInt();int b = in.nextInt();
            cum1+=a;cum2+=b;
            ArrayList<Integer> diff = new ArrayList<>();
            if(cum1<cum2 && cum2-cum1 > max2){
               max2 = cum2-cum1;
            }else if(cum2<cum1 && cum1-cum2 > max1) {
                max1 = cum1-cum2;
            }
        }
        if(max2>max1){
            System.out.println(2+" "+max2);
        }else{
            System.out.println(1+" "+max1);
        }
    }
}
