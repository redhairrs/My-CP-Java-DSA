package com.Rishabh;

import java.util.Scanner;

public class CodeChef34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int ans = 52%n;
            System.out.println(ans);
        }
    }
}
