package com.Rishabh;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class CodeChef30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int fd = in.nextInt();
            int rup = in.nextInt();
            int sum =0;
            int count =0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<fd;i++){
                list.add(in.nextInt());
            }
            Collections.sort(list, Collections.reverseOrder());
            int i=0;
                for( i=0;i<fd;i++){
                    sum +=list.get(i);
                    count++;
                    if(sum >=rup) {
                        System.out.println(count);
                        break;
                    }
                }
              if(i==fd){
                  System.out.println(-1);
              }
        }
    }
}
