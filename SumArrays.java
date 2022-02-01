package com.Rishabh;

import java.util.Arrays;
import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        int nbr = 0;
        for (int i = 0; i < ar.length; i++)
            nbr = nbr * 10 + ar[i];
        int n1 = in.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr[i] = in.nextInt();
        }
        int nbrr = 0;
        for (int i = 0; i < arr.length; i++)
            nbrr = nbrr * 10 + arr[i];

        int sum = nbr + nbrr;

        int number = sum;
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(numbers));
    }
}
