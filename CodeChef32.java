package com.Rishabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeChef32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int sum = 0;
            int exp = 0;
            int n = in.nextInt();
            int n1;
            int index = 0;
            int ans = 1;
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int i=0;i<n;i++){
                n1 = in.nextInt();
                list.add(n1);
                list1.add(n1);
                sum+=n1;
            }
            Collections.sort(list);
            exp=(int)Math.ceil(Math.log(sum)/Math.log(2));
            int sum1 = (int)Math.pow(2,exp);
            int diff = sum1-sum+list.get(0);
            ans = diff/list.get(0);
            for(int i=0;i<n;i++){
                if(list.get(0).equals(list1.get(i))){
                     index = i+1;
                     break;
                }
            }
            if((sum&sum-1) == 0){
                System.out.println(0);
            }else {
                System.out.println(1);
                System.out.println(1+" "+ans);
                System.out.println(index);
            }
        }
    }
}
