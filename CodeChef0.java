package com.Rishabh;

import java.util.ArrayList;

import java.util.Scanner;

public class CodeChef0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String z = in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<s.length();i++){
                list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
            }
            for(int i=0;i<list.size();i++){
                sum +=list.get(i);
            }
            if(sum%3==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
