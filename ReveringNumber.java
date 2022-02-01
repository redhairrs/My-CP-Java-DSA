package com.Rishabh;
import java.util.Scanner;
public class ReveringNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        int a = in.nextInt();
        while (a>0){
          int  rem = a%10;
            a = a/10;
          ans = ans*10 + rem;
        }
        System.out.println(ans);
    }
}
