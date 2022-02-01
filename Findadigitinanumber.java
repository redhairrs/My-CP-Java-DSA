package com.Rishabh;
import java.util.Scanner;
public class Findadigitinanumber {
    public static void main(String[] args) {
        // your code goes here
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {
            int arr = in.nextInt();
            String a = Integer.toString(arr);
            int len = String.valueOf(arr).length();
            int count = 0;
            for (int i = 0; i < len; i++) {
                if (a.charAt(i) == '4') {
                    count++;
                }

            }
            System.out.println(count);

        }
    }
}
