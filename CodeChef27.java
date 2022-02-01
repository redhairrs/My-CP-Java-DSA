package com.Rishabh;

import java.util.Scanner;

public class CodeChef27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
                    int n = in.nextInt();
                    int[] a = new int[n];
                    for(int i = 0; i < n; i++){
                        a[i] = in.nextInt(); //input
                    }
                    int[] pre = new int[n];
                    int[] suf = new int[n];
                    int temp = 0;
                    for(int i = 0; i < n; i++){
                        temp |= a[i];
                        pre[i] = temp;
                    }
                    temp = 0;
                    for(int i = n - 1; i > -1; i--){
                        temp |= a[i];
                        suf[i] = temp;
                    }
                    int ans = 0;
                    for(int i = 0; i < n; i++){
                        if(i > 0){
                            temp |= pre[i - 1];
                        }
                        if(i < n - 1){
                            temp |= suf[i + 1];
                        }
                        ans |= a[i] & temp;
                    }
            System.out.println(ans);
        }
    }
}
