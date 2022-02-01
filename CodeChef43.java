package com.Rishabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeChef43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int k = in.nextInt();
            if(n>1 && k==1){
                System.out.println(-1);
                continue;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1;i<= n; i++) {
                list.add(i);
            }
            Collections.reverse(list.subList((list.size()-(n-k+1)),list.size()));
            for(int x:list){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
