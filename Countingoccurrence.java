package com.Rishabh;
import java.util.Scanner;
public class Countingoccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int a = in.nextInt();
        int b = in.nextInt();
        while (a>0){
        int rem = a%10;
           if (rem==b){
               count++;
           }
             a = a/10;
           }
        System.out.println(count);
        }
    }
