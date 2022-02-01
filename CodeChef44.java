package com.Rishabh;

import java.util.Scanner;

public class CodeChef44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0) {
                int n = in.nextInt();
                int k= in.nextInt();
                String z = in.nextLine();
                String s =in.nextLine();
                int low = 0;
                int high = n + 1;
                while (high - low > 1) {
                    int mid = (high + low)/2;
                    int cnt = 0;
                    for (int i = mid - 1; i >= 0; i--) {
                        int now = (cnt + s.charAt(i) - '0') % 10;
                        if (now != 0) {
                            cnt += 10 - now;
                        }
                    }
                    if (cnt <= k) {
                        low = mid;
                    } else {
                        high = mid;
                    }
                }
            System.out.println(low);
        }
    }
}
