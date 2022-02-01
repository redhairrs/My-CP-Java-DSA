package com.Rishabh;

import java.util.Objects;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int flag = 0;
            int n = in.nextInt();
            int[] str = new int[n];
            for (int i = 0; i < n; i++) {
                str[i] = in.nextInt();
            }

            if (str[0] == 1) {
                if (str[(str.length-1)/2] == 7) {
                    for (int i = 0; i < str.length / 2; i++) {
                        int start = str[i];
                        int end = str[str.length - 1 - i];
                        if (start != end) {
                            flag = 1;
                            break;
                        }
                    }
                }else {
                    flag = 1;
                }
            }else{
                flag = 1;
            }
            if(flag == 0){
                System.out.println("yes");
            }else if (flag == 1){
                System.out.println("No");
            }
        }
    }

}
