package com.Rishabh;

import java.util.Scanner;

public class CodeForce1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String s = in.nextLine();
        while(t-->0) {
            s = in.nextLine();
            int  sza = s.length();

            if(sza%2!=0)
                System.out.println("NO");
            else {
                long p = sza/2;
                String ans = "YES";
                for(long i=0;i<p;i++) {
                    if(s.charAt((int) (p+i)) != s.charAt((int) i)) {
                        ans = "NO";
                        break;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
