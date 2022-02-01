package com.Rishabh;

import java.util.Scanner;
import java.lang.Math;
public class CodeChef3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long T,N,ans,bit;
        T = in.nextInt();
        for(int i=0;i<T;i++){
            N = in.nextInt();
            long a = N & (N - 1);
            if (N == 2) {
                System.out.println("2");
                continue;
            }
            if (a == 0) {
                System.out.println((2 * N - 1) % 1000000007);
            } else {
                bit = (long) (Math.log(N) / Math.log(2));
                ans = (long) Math.pow(2, bit + 1);
                System.out.println(ans % 1000000007);
            }
        }
    }
}
