package com.Rishabh;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeChef22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String z = in.nextLine();
        while(t-->0) {
            String s = in.nextLine();
            int b = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    b = s.length() - i;
                    break;
                }
            }
            if (b>1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
