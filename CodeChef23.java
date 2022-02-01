package com.Rishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodeChef23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String z = in.nextLine();
            String s = in.nextLine();
            ArrayList<String> list = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    list.add(s.substring(i, j));
                }
            }
            for (int i = 0; i < list.size(); i++) {
                int foo = Integer.parseInt(list.get(i), 2);
                list2.add(foo);
            }
            for (int i = 0; i < list2.size(); i++) {
                boolean isPrime = true;
                if (list2.get(i) == 1)
                    isPrime = false;
                else {
                    // check to see if the numbers are prime
                    for (int j = 2; j <= list2.get(i) / 2; j++) {
                        if (list2.get(i) % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        if (list2.get(i) == 0) {
                        } else {
                            System.out.print(list2.get(i) + " , ");
                        }
                    }
                }
            }
        }
        System.out.println(" Are the prime number in the array ");
    }
}
