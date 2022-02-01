package com.Rishabh;

import java.util.Scanner;

public class CodeChef40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int count = 0;
                for(char i='a';i<'a'+n;i++){
                    System.out.print(i);
                    count++;
                    if(count == 26){
                        n -=count;
                        i -=count;
                    }
                }
            System.out.println();
        }
    }
}
