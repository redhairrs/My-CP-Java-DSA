package com.Rishabh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeChef5usingBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr1 = new String[100000];
        int[]  arr2 = new int[100000];
        String s = "";
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int c1 = 0;
            int c2 = 0;
            int arr;
            s = in.readLine();
            arr1 = s.split(" ",n);
            for(int i=0;i<n;i++)
                arr2[i] = Integer.parseInt(arr1[i]);

            for (int i = 0; i < n; i++) {
                if (arr2[i] % 3 == 1) {
                    c1++;
                } else if (arr2[i] % 3 == 2) {
                    c2++;
                }
            }
            int a = Math.abs(c1 - c2);
            int b = Math.min(c1, c2);
            double c = (double) b + (double) (2 * a) / (3.0);

            if (Math.floor(c) != Math.ceil(c)) {
                System.out.println(-1);
            } else {
                System.out.println((int) c);
            }
        }
    }
}
