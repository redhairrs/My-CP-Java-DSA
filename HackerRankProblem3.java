package com.Rishabh;
import java.util.Scanner;
public class HackerRankProblem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum;
        int N = in.nextInt();
        if (N>=2 && 10>N) {
            for (int i = 1; i <= 20; i++) {
                sum = N * i;
                System.out.println(N + " x " + i + " = " + sum);
            }
        }else{
            System.out.println("Invalid");
        }
    }
}
