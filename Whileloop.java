package com.Rishabh;
import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        do {
//            System.out.print(n + " ");
//            n++;
//        }while (n <= 5);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);
        }
    }
