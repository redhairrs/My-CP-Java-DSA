package com.Rishabh;
import java.util.*;

public class CodeChef15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0) {
            int n = in.nextInt();//4
            int k = in.nextInt();//2 // n-k==2 , 0 1 2
            int ans = 0;//2
            int xo = 0; // 0
            String z = in.nextLine();
            String s = in.nextLine();//1101 // 11 10 01
            for(int i=0;i<=n-k;i++) {
                xo ^= s.charAt(i) - '0'; // i =2 0^0 == 0
            }
            if (xo == 1)ans++;
            int bag = 0;int end = n-k+1;
            while(end<n){
                xo^=s.charAt(bag++) - '0';
                xo^=s.charAt(end++) - '0';
                if (xo == 1)ans++;
            }
            System.out.println(ans);
        }
    }
}
