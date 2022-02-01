package com.Rishabh;

import java.util.Scanner;

public class CodeChef19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = in.nextInt();
        while(t-->0) {
            int c = in.nextInt();
            int[] arr = new int[c];
            int ans = 0;
            int pow = 1;
            for (int i = 0; i < c; i++) {
                arr[i] = in.nextInt();
            }
            for (int j = 0; j < 32; j++) {
                int count = 0;
                for (int i = 0; i < c; i++) {
                    if (arr[i] % 2 == 1) count++;
                    arr[i] /= 2;
                }
                if (count > 1) {
                    ans = ans + (pow);
                }
                pow *= 2;
            }
            sb.append(ans + "\n");

        }
        System.out.print(sb);
    }
}
