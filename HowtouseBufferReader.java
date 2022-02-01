package com.Rishabh;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HowtouseBufferReader {
    public static void main(String[] args)  throws java.lang.Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] arr = new String[n];
        String s = in.readLine();
        arr = s.split(" ",n);
        int i = 0;
        int[] arrr = new int[n];
        while (n-->0){
            arrr[i] = Integer.parseInt(arr[i]);
            i++;
        }
        System.out.println(Arrays.toString(arrr));

    }
}
