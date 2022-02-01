package com.Rishabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeForce5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(in.nextInt());
            }
            Collections.sort(list);
            int a = list.get(n-1)-list.get(0);
            System.out.println(a);
        }
    }
}
