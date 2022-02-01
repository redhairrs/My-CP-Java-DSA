package com.Rishabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeChef39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(in.nextInt());
            }
            Collections.sort(list);
            double max = list.get(n-1);
            double n2 = 0;
            for(int i=0;i<n-1;i++){
                n2 +=list.get(i);
            }
            double mean = n2/(list.size()-1);
            System.out.println(max+mean);
        }
    }
}
